package com.example.traveloid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.io.BufferedReader;

public class LoginPage extends AppCompatActivity {
    FirebaseAuth mAuth;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mAuth=FirebaseAuth.getInstance();
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);


    }
    public void checkUser(){
        String username=user.getText().toString().trim();
        String password=pass.getText().toString().trim();

        if(username.isEmpty()){
            Toast.makeText(LoginPage.this, "Username empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (password.isEmpty()){
            Toast.makeText(LoginPage.this, "Password empty", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(username,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent=new Intent(LoginPage.this,homepage.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(LoginPage.this,"Incorrect username or password",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


    public void signup(View view){
        Intent intent=new Intent(this,singnup.class);
        startActivity(intent);

    }
    public void login(View view){
        checkUser();
    }
}
