package com.bignerdranch.android.personaltrainerapp.database.helperclass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigMember;
import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigTransaction;

public class DatabaseHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqLiteDatabase;
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

    public Cursor retrieveMember(String name) {
        //Retrieve the DB
        sqLiteDatabase = this.getWritableDatabase();

        //Create a query to select all the rows (here it was already defined as a constant)
        //Returns a resultSet, i.e. the cursor, send it back to the main activity to display
        Cursor cursor = sqLiteDatabase.rawQuery(Config.MEMBER_SELECT_ALL_BY_NAME, new String[] {name});

        return cursor;
    }

    public Cursor retrieveMembership(int mID) {
        //Retrieve the DB
        sqLiteDatabase = this.getWritableDatabase();

        //Create a query to select all the rows (here it was already defined as a constant)
        //Returns a resultSet, i.e. the cursor, send it back to the main activity to display
        Cursor cursor = sqLiteDatabase.rawQuery(Config.MEMBERSHIP_SELECT_ALL_BY_ID, new String[] {String.valueOf(mID)});

        return cursor;
    }

    public Cursor retrieveMembercard(int mID) {
        //Retrieve the DB
        sqLiteDatabase = this.getWritableDatabase();

        //Create a query to select all the rows (here it was already defined as a constant)
        //Returns a resultSet, i.e. the cursor, send it back to the main activity to display
        Cursor cursor = sqLiteDatabase.rawQuery(Config.MEMBER_CARD_SELECT_ALL_BY_ID, new String[] {String.valueOf(mID)});

        return cursor;
    }

    public long insertTransactionData(int transactionID, String paymentType, double amount, String date) {
        //Create a new instance of the ContentValues class & take the data from the EditTexts
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", transactionID);
        contentValues.put("Payment", paymentType);
        contentValues.put("Amount", amount);
        contentValues.put("Date", date);

        showToast(contentValues.toString());

        //Retrieve the in-memory database
        sqLiteDatabase = this.getWritableDatabase();

        long rowNumUpd = sqLiteDatabase.insert(ConfigTransaction.TRANSACTION_TABLE_NAME,
                    null, contentValues); //You need to provide the table name, the column data, the where clause & a string array)

        return rowNumUpd;
    }

    public Cursor getTransaction(int tID) {
        //Retrieve the DB
        sqLiteDatabase = this.getWritableDatabase();

        //Create a query to select all the rows (here it was already defined as a constant)
        //Returns a resultSet, i.e. the cursor, send it back to the main activity to display
        Cursor cursor = sqLiteDatabase.rawQuery(Config.TRANSACTION_SELECT_ALL_BY_ID, new String[] {String.valueOf(tID)});

        return cursor;
    }

    private void showToast(String message){
        Toast toast;
        toast = Toast.makeText(this.mContext, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
