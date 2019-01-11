package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class france_cusine extends AppCompatActivity {
    FragmentActivity frgps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_france_cusine);
    }
    public void revFr (View v){
        Intent revFr1 = new Intent(france_cusine.this, ReviewFrance.class);
        startActivity(revFr1);
    }
        public void gpsFr1 (View v){
        Intent gpsfr = new Intent (france_cusine.this, FrGps.class);
         startActivity (gpsfr);


    }
}


