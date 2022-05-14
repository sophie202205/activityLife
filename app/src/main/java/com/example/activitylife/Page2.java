package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.v("brad", "page2, name = " + name);
    }

    public void test1(View view) {
        finish();
    }

    @Override
    public void finish(){
        //setResult(320);
        //Page2 會消失所以Intent不用代值
        Intent intent = new Intent();
        intent.putExtra("Key1", 333);
        intent.putExtra("Key2", "gogo!");
        setResult(300, intent);
        super.finish();
    }
}