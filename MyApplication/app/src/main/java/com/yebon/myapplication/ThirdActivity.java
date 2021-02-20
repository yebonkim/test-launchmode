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
                startActivity(new Intent(this, MainActivity.class));
                break;
            case ExperimentConstant.TEST_IN_TWO_TASK:
                Intent i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(ExperimentConstant.TAG, "third : on Destroy");
    }
}