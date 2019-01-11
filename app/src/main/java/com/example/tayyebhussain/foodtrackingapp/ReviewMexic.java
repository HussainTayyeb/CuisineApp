package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReviewMexic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_review_mexic);
    }

    public void closeMex (View v){
        Intent close = new Intent (ReviewMexic.this, mex_cusine.class);
        startActivity (close);
    }
}
