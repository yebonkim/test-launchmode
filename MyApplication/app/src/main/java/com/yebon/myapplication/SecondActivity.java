package com.yebon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        switch (ExperimentConstant.testVersion) {
            case ExperimentConstant.TEST_IN_ONE_TASK:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case ExperimentConstant.TEST_IN_TWO_TASK:
                Intent i = new Intent(this, OtherTaskActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(ExperimentConstant.TAG, "second : on Destroy");
    }
}