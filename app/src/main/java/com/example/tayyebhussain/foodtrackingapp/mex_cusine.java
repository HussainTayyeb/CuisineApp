package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mex_cusine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_mex_cusine);
    }

    public void revMex (View v){
        Intent rev = new Intent (mex_cusine.this, ReviewMexic.class);
        startActivity (rev);
    }

    public void gpsMex (View v){
        Intent gps = new Intent (mex_cusine.this,MexGps.class);
        startActivity (gps);
    }
}
