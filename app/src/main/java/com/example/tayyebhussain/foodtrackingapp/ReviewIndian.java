package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReviewIndian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_review_indian);
    }

    public void closeind (View v){
        Intent close = new Intent (ReviewIndian.this, ind_cusine.class);
        startActivity (close);
    }
}
