package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_start_page);
    }

    public void fabFood(View v){
        Intent addFood = new Intent (this,addFood.class);
        startActivity(addFood);
    }

    public void fabDrink(View v){
        Intent addDrink = new Intent (this,addDrink.class);
        startActivity(addDrink);

    }
}
