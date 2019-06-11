package com.example.traveloid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void donebtn(View view){
        Intent intent =new Intent(this,homepage.class);
        startActivity(intent);
        finish();
    }
    public void logout(View view){
        Intent i=new Intent(this,LoginPage.class);
        startActivity(i);
        finish();

    }

}
