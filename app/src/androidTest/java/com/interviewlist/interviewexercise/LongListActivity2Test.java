package com.interviewlist.interviewexercise;

import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;

/**
 * Created by vwillot on 7/21/2017.
 */

public class LongListActivity2Test {

    private static final String FIRST_TASK = "task: eat";
    private static final String LAST_TASK_ID = "task: row";

    private static final String TASK_DRIVE = "task: drive";
    private static final String TASK_DRIVE_VALUE = "drive";

    private static final String TASK_CALL = "task: call";
    private static final String TASK_CALL_VALUE = "call";


    @Rule
    public ActivityTestRule<LongListActivity> mActivityRule = new ActivityTestRule<>(
            LongListActivity.class);

    @Test
    public void testRowLabel() {
        onView(withId(R.id.selection_row)).check(matches(withText("Clicked on task")));
    }

    @Test
    public void testIfListViewIsPresent(){
//        onView(withId(R.id.list)).check(matches(isDisplayed()));
    }

//    @Test
//    public void testTryToGetFirstElement(){
//        onData(anything()).inAdapterView(withId(R.id.list)).atPosition(0).onChildView(withId(R.id.rowContentTextView)).check(matches(withText(FIRST_TASK)));
//    }

    @Test
    public void testSecondButtonIsCheckedandThenUncheckedAfterClick(){
        DataInteraction dataInteraction = onData(hasEntry(equalTo(LongListActivity.ROW_TEXT), is("task: sleep")));
        dataInteraction.onChildView(withId(R.id.rowToggleButton)).check(matches(isChecked())).perform(click());

    }

    @Test
    public void testThatActivityNameAppearNextToLabelOnlyWhenRowContentTextViewIsClicked(){
    }
}
