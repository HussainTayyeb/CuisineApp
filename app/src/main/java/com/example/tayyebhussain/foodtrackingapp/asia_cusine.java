package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class asia_cusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_asia_cusine);

    }
    public void revAsia (View v){
        Intent rev = new Intent (asia_cusine.this, ReviewAsian.class);
        startActivity (rev);
    }

    public void gpsAsia(View v){
        Intent gps = new Intent (asia_cusine.this,AsiaGps.class);
        startActivity (gps);
    }
}
