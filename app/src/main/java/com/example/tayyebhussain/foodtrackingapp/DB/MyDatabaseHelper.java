package com.example.tayyebhussain.foodtrackingapp.DB;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.tayyebhussain.foodtrackingapp.DB.Database.*;


public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Foodtracker.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TAG ="Test";

    //Database creation
    private static final String DATABASE_CREATE = "create table register " +
            "(_id integer primary key, name text not null );";

    public MyDatabaseHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION  );
    }

    //Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_REGISTER_TABLE = " CREATE TABLE " +
                      RegisterTable.TABLE_NAME + " (" +
                      RegisterTable.COLUMN_EMAIL + " TEXT UNIQUE NOT NULL, " +
                      RegisterTable.COLUMN_USERNAME + " TEXT UNIQUE NOT NULL, " +
                      RegisterTable.COLUMN_PASSWORD + " TEXT NOT NULL" +
                      ");";

        db.execSQL (SQL_CREATE_REGISTER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*Log.w (MyDatabaseHelper.class.getName (), "Upgrading Database from version "+ oldVersion + "to"
        + newVersion + ", which will destroy all old data ");
         */
        db.execSQL ("Drop TABLE IF EXISTS " + RegisterTable.TABLE_NAME);
        onCreate (db);
    }

    public void addUser (String email, String usrname, String password ) {
         SQLiteDatabase db = this.getWritableDatabase ();

        ContentValues values = new ContentValues ();
        values.put(RegisterTable.COLUMN_EMAIL, email); //EMAIL
        values.put(RegisterTable.COLUMN_USERNAME, usrname); //USERNAME
        values.put(RegisterTable.COLUMN_PASSWORD, password); //PASSWORD

        long id = db.insert (RegisterTable.TABLE_NAME,  null, values );
        db.close ();

        Log.d(TAG,"New user inserted into the database: " + usrname);
    }




}
