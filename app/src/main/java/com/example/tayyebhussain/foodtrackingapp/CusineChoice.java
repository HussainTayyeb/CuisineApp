package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CusineChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_cusine_choice);
    }
    public void frBtnChoice1 (View v){
        Intent FrChoice = new Intent (CusineChoice.this, france_cusine.class);
        startActivity (FrChoice);
    }

    public void itBtnChoice(View v){
        Intent itaChoice = new Intent (CusineChoice.this, ita_cusine.class);
        startActivity (itaChoice);
    }

    public void asiaBtnChoice (View v){
        Intent asiaChoice = new Intent (CusineChoice.this, asia_cusine.class);
        startActivity (asiaChoice);
    }
    public void amerikBtnChoice (View v){
        Intent amerikChoice = new Intent (CusineChoice.this, amerik_cusine.class);
        startActivity (amerikChoice);
    }

    public void mexBtnChoice(View v){
        Intent mexChoice = new Intent (CusineChoice.this, mex_cusine.class);
        startActivity (mexChoice);
    }

    public void indBtnChoice(View v){
        Intent indChoice = new Intent (CusineChoice.this, ind_cusine.class);
        startActivity (indChoice);
    }
}
