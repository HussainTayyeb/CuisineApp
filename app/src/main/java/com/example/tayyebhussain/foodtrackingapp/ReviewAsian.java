package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReviewAsian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_review_asian);
    }

    public void closeAsiaRev (View v){
        Intent close = new Intent (ReviewAsian.this, asia_cusine.class);
        startActivity (close);
    }

}
