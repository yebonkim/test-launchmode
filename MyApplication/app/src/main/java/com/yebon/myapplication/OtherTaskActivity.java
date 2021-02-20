package com.yebon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class OtherTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        switch (ExperimentConstant.testVersion) {
            case ExperimentConstant.TEST_IN_ONE_TASK:
                // is not used.
                break;
            case ExperimentConstant.TEST_IN_TWO_TASK:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(ExperimentConstant.TAG, "other : on Destroy");
    }
}