package com.example.traveloid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT=500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homestart=new Intent(MainActivity.this,LoginPage.class);
                startActivity(homestart);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}
