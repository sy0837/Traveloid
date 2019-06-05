package com.example.traveloid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

    }
    public void signup(View view){
        Intent intent=new Intent(this,singnup.class);
        startActivity(intent);
    }
    public void login(View view){
        Intent intent=new Intent(this,homepage.class);
        startActivity(intent);
    }
}
