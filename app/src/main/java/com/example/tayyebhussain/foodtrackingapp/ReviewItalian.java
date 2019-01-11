package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReviewItalian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_review_italian);
    }

    public void closeItaRev (View v){
        Intent revIta = new Intent (ReviewItalian.this, ita_cusine.class);
        startActivity(revIta);
    }
}
