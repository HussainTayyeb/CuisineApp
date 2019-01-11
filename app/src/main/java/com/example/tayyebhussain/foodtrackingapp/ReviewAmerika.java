package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReviewAmerika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_review_amerika);
    }

    public void closeAmerikRev (View v){
            Intent close = new Intent (ReviewAmerika.this, amerik_cusine.class);
            startActivity (close);
    }

}
