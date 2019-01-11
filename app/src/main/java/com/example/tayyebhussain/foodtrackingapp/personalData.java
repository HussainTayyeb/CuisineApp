package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;

import com.example.tayyebhussain.foodtrackingapp.DB.persData;

public class personalData extends AppCompatActivity {
    persData pData;
    EditText name;
    EditText surname;
    EditText age;
    Spinner gender;
    Spinner lifestyle;
    Button submitBtnPersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        name = findViewById(R.id.name);        ///// COPY bis zeile 53
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        lifestyle = findViewById(R.id.lifestyle);
        pData = new persData(this);



    }
    public void submitBtnPersonal (View v){

        String name1 = name.getText().toString().trim();
        String surname1 = surname.getText().toString().trim();
        String age1 = age.getText().toString().trim();
        String gender1 = gender.getSelectedItem().toString().trim();
        String lifestyle1 = lifestyle.getSelectedItem().toString().trim();
        // zeile 77 einfuegen und bearbeiten


        pData.addData(name1, surname1, age1, gender1, lifestyle1);
        Toast.makeText(getApplicationContext(), "Your data have been saved", Toast.LENGTH_LONG).show();
        Intent StartPage = new Intent(personalData.this, CusineChoice.class);
        startActivity(StartPage);

    }

}