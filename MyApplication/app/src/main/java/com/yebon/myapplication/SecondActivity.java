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

        startActivity(new Intent(this, ThirdActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(ExperimentConstant.TAG, "second : on Destroy");
    }
}