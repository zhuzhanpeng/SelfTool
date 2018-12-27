package com.example.edison.selftool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import onairm.com.devtool.TipToast;

public class TestActivity extends AppCompatActivity {
    private TextView tvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tvTest=findViewById(R.id.tvTest);
        tvTest.setText(getTaskId()+"");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e("TestActivity", "onNewIntent: ");
    }
}
