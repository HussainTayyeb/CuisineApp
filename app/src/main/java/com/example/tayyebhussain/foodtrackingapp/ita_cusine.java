package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ita_cusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ita_cusine);
    }

    public void revIta (View v){
        Intent x = new Intent (ita_cusine.this, ReviewItalian.class);
        startActivity(x);
    }
    public void gpsIta (View v){
        Intent gps = new Intent (ita_cusine.this,ItaGps.class);
        startActivity (gps);
    }

}
