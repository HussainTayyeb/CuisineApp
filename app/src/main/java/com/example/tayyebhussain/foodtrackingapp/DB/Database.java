package com.example.tayyebhussain.foodtrackingapp.DB;

import android.provider.BaseColumns;

public class Database {

    private Database (){

    }

    public final class RegisterTable implements BaseColumns {
        public static final String TABLE_NAME = "register";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "password";
    }
        public final class PersData implements BaseColumns {
            public static final String TABLE_NAME = "personalData";
            public static final String COLUMN_NAME = "name";
            public static final String COLUMN_SURNAME = "surname";
            public static final String COLUMN_AGE = "age";
            public static final String COLUMN_GENDER = "gender";
            public static final String COLUMN_LIFESTYLE = "lifestyle";
        }

    }