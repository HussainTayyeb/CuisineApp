package com.example.tayyebhussain.foodtrackingapp.DB;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;



public class persData extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "persData.db";
    private static final int DATABASE_VERSION = 2;
    private static final String TAG = "pData";

    //Database creation
    private static final String DATABASE_CREATE = "create table register " +
            "(_id integer primary key, name text not null );";

    public persData(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_PERSDATA =  " CREATE TABLE " +
                Database.PersData.TABLE_NAME + "(" +
                Database.PersData.COLUMN_NAME + " TEXT NOT NULL, " +
                Database.PersData.COLUMN_SURNAME + " TEXT NOT NULL, " +
                Database.PersData.COLUMN_AGE +  " TEXT NOT NULL, " +
                Database.PersData.COLUMN_GENDER + " TEXT NOT NULL, " +
                Database.PersData.COLUMN_LIFESTYLE + " TEXT NOT NULL" +
                ");";

        db.execSQL(SQL_CREATE_PERSDATA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*Log.w (MyDatabaseHelper.class.getName (), "Upgrading Database from version "+ oldVersion + "to"
        + newVersion + ", which will destroy all old data ");
         */
        db.execSQL("Drop TABLE IF EXISTS " + Database.PersData.TABLE_NAME);
        onCreate(db);
    }

    public void addData(String name, String surname, String age, String gender,String lifestyle ) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Database.PersData.COLUMN_NAME, name); //NAME
        values.put(Database.PersData.COLUMN_SURNAME, surname); //SURNAME
        values.put(Database.PersData.COLUMN_AGE, age); //AGE
        values.put(Database.PersData.COLUMN_GENDER, gender); //GENDER
        values.put(Database.PersData.COLUMN_LIFESTYLE, lifestyle); //LIFESTYLE



        long id = db.insert(Database.PersData.TABLE_NAME, null, values);
        db.close();

        Log.d(TAG, "The user added the personal data ");
    }
}