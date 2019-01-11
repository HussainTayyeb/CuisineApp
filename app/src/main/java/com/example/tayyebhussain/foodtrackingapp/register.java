package com.example.tayyebhussain.foodtrackingapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tayyebhussain.foodtrackingapp.DB.MyDatabaseHelper;

import org.w3c.dom.Text;

import java.util.regex.Pattern;

public class register extends AppCompatActivity {
    public static final Pattern PASSWORD_PATTERN =
            Pattern.compile (
                            //"(?=.*[0-9])" +         //at least 1 digit
                             //"(?=.*[a-z])" +         //at least 1 lower case letter
                             //"(?=.*[A-Z])" +         //at least 1 upper case letter
                            "(?=.*[a-zA-Z])" +      //any letter
                            "(?=.*[@#$%^&+=.,;!?])" + //at least 1 special character
                            "(?=\\S+$)" +           //no white spaces
                            ".{4,}" +               //at least 4 characters
                            "$");

    MyDatabaseHelper myDB;
    EditText regEmail;
    EditText regUsrName;
    EditText regPassword;
    EditText regCfrmPassword;
    Button regSubmit;

    String email;
    String usrName;
    String password;
    String CfrmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_register);


        regEmail = findViewById (R.id.regEmail);
        regUsrName = findViewById (R.id.regUserName);
        regPassword = findViewById (R.id.regPassword);
        regSubmit = findViewById (R.id.RegisterBtn);
        regCfrmPassword = findViewById (R.id.regCfrmPassword);
        myDB = new MyDatabaseHelper (this);


        regSubmit.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {


                //myDB.addUser ("Hallo@hotmail.de","hello", "1234");

                email = regEmail.getText ().toString ().trim ();
                usrName = regUsrName.getText ().toString ().trim ();
                password = regPassword.getText ().toString ().trim ();
                CfrmPassword = regCfrmPassword.getText().toString ().trim ();

                validateEmail ();
                validateUsrName();
                validatePassword();
                confirmPassword ();





                if (validateEmail ()&& validateUsrName () && validatePassword() && confirmPassword () == true){
                    myDB.addUser (email, usrName, password);
                    Intent submitBtnRegister = new Intent (register.this, personalData.class);
                    Toast.makeText (getApplicationContext (), "register successfully", Toast.LENGTH_LONG).show ();
                    startActivity (submitBtnRegister);

                }else {
                    Toast.makeText (getApplicationContext (), "Invalid data", Toast.LENGTH_LONG).show ();

                }


            }
        });


    }

        public boolean validateEmail(){
            String  email = regEmail.getText ().toString ().trim ();
            if (email.isEmpty ()){
                regEmail.setError("Field can't be empty");
                return false;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches ()){ //not match (@. and so on regex)
                regEmail.setError("Please enter a valid email address");
                return false;
            }else {
                regEmail.setError (null);
                return true;
            }
    }


        public boolean validateUsrName() {
            String usrName = regUsrName.getText ().toString ().trim ();

            if (usrName.isEmpty ()) {
                regUsrName.setError ("Field can't be empty");
                return false;
            } else {
                return true;
            }
        }



         public boolean validatePassword(){
             String password = regPassword.getText ().toString ().trim ();
        if(password.isEmpty ()){
            regPassword.setError("Field can't be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(password).matches ()){
            regPassword.setError ("Password too weak.\n" +
                                  "Password should contain at least 4 characters and one special character @#$%^&+=.,;!?");

            return false;
        }else {
            regPassword.setError(null);
            return true;
        }

    }

    public boolean confirmPassword(){
        String password = regPassword.getText ().toString ().trim ();
        String CfrmPassword = regCfrmPassword.getText().toString ().trim ();
        if (!CfrmPassword.equals (password)){
            regCfrmPassword.setError ("Password does not match");
            return false;
        } else{
            return true;
        }
    }

}
