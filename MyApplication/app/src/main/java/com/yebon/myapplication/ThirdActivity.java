package com.yebon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        switch (ExperimentConstant.testVersion) {
            case ExperimentConstant.TEST_IN_ONE_TASK:
            case ExperimentConstant.TEST_IN_TWO_TASK:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(ExperimentConstant.TAG, "third : on Destroy");
    }
}