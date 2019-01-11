package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);
    }

    public void forgotPass (View v){
        Intent frgtPass = new Intent (login.this, forgotPassword.class);
        startActivity(frgtPass);
    }
    public void loginBtn (View v){
        Intent login = new Intent (login.this, CusineChoice.class);
        startActivity (login);
    }


}
