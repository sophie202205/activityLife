package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    @Override
    public void finish() {
        setResult(400);
        super.finish();
    }
}