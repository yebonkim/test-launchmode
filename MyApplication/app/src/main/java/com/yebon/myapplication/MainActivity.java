package com.yebon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch (ExperimentConstant.testVersion) {
            case ExperimentConstant.TEST_IN_ONE_TASK:
            case ExperimentConstant.TEST_IN_TWO_TASK:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d(ExperimentConstant.TAG, "main : on new intent");
    }
}