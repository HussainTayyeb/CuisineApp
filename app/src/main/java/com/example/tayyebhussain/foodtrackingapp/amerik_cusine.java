package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class amerik_cusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_amerik_cusine);
    }

    public void revAmerik (View v){
        Intent rev = new Intent (amerik_cusine.this, ReviewAmerika.class);
        startActivity (rev);
    }

    public void gpsAmerik (View v){
        Intent gps = new Intent (amerik_cusine.this,AmerikGps.class);
        startActivity (gps);
    }
}
