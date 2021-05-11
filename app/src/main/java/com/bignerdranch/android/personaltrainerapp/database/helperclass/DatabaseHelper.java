package com.bignerdranch.android.personaltrainerapp.database.helperclass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigMember;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context mContext;

    public DatabaseHelper(@Nullable Context context) {
        super(context, Config.DATABASE_NAME, null, Config.DATABASE_VERSION);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(Config.CREATE_TABLE_CLASS_ACTIVITY);
            db.execSQL(Config.CREATE_TABLE_MEMBER);
            db.execSQL(Config.CREATE_TABLE_MEMBER_CARD);
            db.execSQL(Config.CREATE_TABLE_MEMBERSHIP);
            db.execSQL(Config.CREATE_TABLE_TRANSACTION);

            showToast("Created the tables for the database.");
        }
        catch(Exception e) {
            showToast(e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void showToast(String message){
        Toast toast;
        toast = Toast.makeText(this.mContext, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
