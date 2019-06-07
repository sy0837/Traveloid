package com.example.traveloid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class singnup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singnup);
        Button createAccount=(Button)findViewById(R.id.createaccount);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });
    }
    public void openMainPage(){
        Intent intent=new Intent(this,homepage.class);
        startActivity(intent);
        finish();
    }
}
