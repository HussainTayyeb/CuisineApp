package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }
    public void loginBtn(View v){
        Intent login = new Intent (MainActivity.this,login.class);
        startActivity (login);
    }
    public void signupBtn(View v){
        Intent signUp = new Intent (MainActivity.this,register.class);
        startActivity (signUp);
    }
}
