package com.example.traveloid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int n=2;
    boolean stopTimer=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler= new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                n--;
                if(n<0){
                    stopTimer=true;
                }
                if(stopTimer==false){
                    handler.postDelayed(this,1000);
                }
                if(stopTimer==true){
                    Intent intent=new Intent(MainActivity.this,LoginPage.class);
                    startActivity(intent);
                }
            }
        });
    }
}
