package com.interviewlist.interviewexercise;

import android.app.Activity;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LongListActivity extends Activity {

    @VisibleForTesting
    protected static final String[] tasks = new String[]{"eat", "sleep", "play","work","write","workout","clean","cook","cry","laugh","build","drink","drive","wait","call","sit","run","jump","read","watch tv","sweep","garden","fix","bike","row"};

    @VisibleForTesting
    protected static final String ROW_TEXT = "ROW_TEXT";

    @VisibleForTesting
    protected static final String ROW_ENABLED = "ROW_ENABLED";

    @VisibleForTesting
    protected static final String ITEM_TEXT_FORMAT = "task: %s";

    private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_list);

//        generate the data with ROW_TEXT - task and Row_ENABLED - boolean

    }

//    SimpleAdapter
}
