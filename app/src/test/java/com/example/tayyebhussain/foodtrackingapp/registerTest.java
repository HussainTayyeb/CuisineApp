package com.example.tayyebhussain.foodtrackingapp;

import android.provider.ContactsContract;
import android.service.autofill.RegexValidator;
import android.util.Patterns;
import android.widget.EditText;

import com.example.tayyebhussain.foodtrackingapp.DB.Database;
import com.example.tayyebhussain.foodtrackingapp.DB.MyDatabaseHelper;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class registerTest {

    private MyDatabaseHelper database;


    @Test
    public void checkPasswordEqual(){
        register test = new register ();
        String password = test.password = "abc123!";
        String CfrmPassword = test.CfrmPassword = "abc123!";

        assertEquals (password, CfrmPassword);
    }

    @Test
    public void checkPasswordPattern(){
        register test = new register ();
        String passwordpattern =   "(?=.*[a-zA-Z])"+
                "(?=.*[@#$%^&+=.,;!?])" +
                "(?=\\S+$)" +
                ".{4,}" +
                "$";

        String password = test.password = "abc123!";

        Assert.assertTrue (password, password.matches (passwordpattern));
    }

    @Test
    public void addedDB() {
        register test = new register ();
        String email = "test@web.de";
        String usrname = "Hans";
        String password = "123asd!";
        test.myDB.addUser (email,usrname,password);

    }

}