package com.example.activitylife;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad", "onCreate");

        inputName = findViewById(R.id.inputName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }

    public void test1(View view) {
        finish();
    }

    @Override
    public void finish() {
        //super.finish();
        Toast.makeText(this, "one more time", Toast.LENGTH_SHORT).show();
    }

    public void test2(View view) {
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }

    public void test3(View view) {
        String name = inputName.getText().toString();
        Intent intent = new Intent(this, Page2.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void test4(View view) {
        Intent intent = new Intent(this, Page2.class);
        startActivityForResult(intent, 475);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int key1 = data.getIntExtra("Key1", -1);
        String key = data.getStringExtra("Key2");
        Log.v("brad",  key1 + ":"  + key);
        Log.v("brad", "onActivityResult = " + requestCode + ":"  + resultCode);
    }
}