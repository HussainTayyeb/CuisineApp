package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ind_cusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ind_cusine);
    }

    public void revInd (View v){
        Intent rev = new Intent (ind_cusine.this, ReviewIndian.class);
        startActivity (rev);
    }

    public void gpsInd (View v){
        Intent gps = new Intent (ind_cusine.this,IndGps.class);
        startActivity (gps);
    }

}
