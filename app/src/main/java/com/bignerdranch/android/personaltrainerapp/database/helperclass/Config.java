package com.bignerdranch.android.personaltrainerapp.database.helperclass;

import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigClassActivity;
import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigMember;
import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigMemberCard;
import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigMembership;
import com.bignerdranch.android.personaltrainerapp.database.accessactivity.ConfigTransaction;

public class Config {
    //Define fields for the db name & version
    public static final String DATABASE_NAME = "personal_trainer";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE_CLASS_ACTIVITY = "CREATE TABLE " + ConfigClassActivity.CLASS_ACTIVITY_TABLE_NAME +
            " ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ConfigClassActivity.COLUMN_NAME + " VARCHAR(255), " +
            ConfigClassActivity.COLUMN_TYPE + " VARCHAR(255), " +
            ConfigClassActivity.COLUMN_TIME + " VARCHAR(15), " +
            ConfigClassActivity.COLUMN_ROOM_ID + " Integer);";

    public static final String CREATE_TABLE_MEMBER = "CREATE TABLE " + ConfigMember.MEMBER_TABLE_NAME +
            " ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ConfigMember.COLUMN_NAME + " VARCHAR(255), " +
            ConfigMember.COLUMN_ADDRESS + " VARCHAR(255), " +
            ConfigMember.COLUMN_GENDER + " CHAR(1), " +
            ConfigMember.COLUMN_PHONE_NUMBER + " VARCHAR(255), " +
            ConfigMember.COLUMN_EMAIL + " VARCHAR(255), " +
            ConfigMember.COLUMN_FEE + " Double(6, 2), " +
            ConfigMember.COLUMN_LAST_PAYMENT + " VARCHAR(255), " +
            ConfigMember.COLUMN_IS_ACTIVE + " Boolean;";

    public static final String CREATE_TABLE_MEMBER_CARD = "CREATE TABLE " + ConfigMemberCard.MEMBER_CARD_TABLE_NAME +
            " ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ConfigMemberCard.COLUMN_MEMBERSHIP_ID + " Integer, " +
            ConfigMemberCard.COLUMN_PHOTO_DIR + " VarChar(255);";

    public static final String CREATE_TABLE_MEMBERSHIP = "CREATE TABLE " + ConfigMembership.MEMBERSHIP_TABLE_NAME +
            " ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ConfigMembership.COLUMN_MEMBER_ID + " Integer, " +
            ConfigMembership.COLUMN_SIGN_UP_DATE + " VARCHAR(255), " +
            ConfigMembership.COLUMN_EXPIRY_DATE + " VarCHar(255), " +
            ConfigMembership.COLUMN_PAYMENT_PLAN + " VARCHAR(255), " +
            ConfigMembership.COLUMN_TYPE + " VARCHAR(255);";

    public static final String CREATE_TABLE_TRANSACTION = "CREATE TABLE " + ConfigTransaction.TRANSACTION_TABLE_NAME +
            " ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ConfigTransaction.COLUMN_TRANSACTION_ID + " Integer, " +
            ConfigTransaction.COLUMN_PAYMENT_TYPE + " VARCHAR(255), " +
            ConfigTransaction.COLUMN_AMOUNT + " Double(6, 2), " +
            ConfigTransaction.COLUMN_DATE + " VARCHAR(255);";

    public static final String DROP_TABLE_CLASS_ACTIVITY = "DROP TABLE IF EXISTS " + ConfigClassActivity.CLASS_ACTIVITY_TABLE_NAME;

    public static final String DROP_TABLE_MEMBER = "DROP TABLE IF EXISTS " + ConfigMember.MEMBER_TABLE_NAME;

    public static final String DROP_TABLE_MEMBER_CARD = "DROP TABLE IF EXISTS " + ConfigMemberCard.MEMBER_CARD_TABLE_NAME;

    public static final String DROP_TABLE_MEMBERSHIP = "DROP TABLE IF EXISTS " + ConfigMembership.MEMBERSHIP_TABLE_NAME;

    public static final String DROP_TABLE_TRANSACTION = "DROP TABLE IF EXISTS " + ConfigTransaction.TRANSACTION_TABLE_NAME;

    public static final String MEMBER_SELECT_ALL_BY_NAME = "Select * From " + ConfigMember.MEMBER_TABLE_NAME + " Where " + ConfigMember.COLUMN_NAME + " = ?";

    public static final String MEMBERSHIP_SELECT_ALL_BY_ID = "Select * From " + ConfigMembership.MEMBERSHIP_TABLE_NAME + " Where " + ConfigMembership.COLUMN_MEMBER_ID + " = ?";

    public static final String MEMBER_CARD_SELECT_ALL_BY_ID = "Select * From " + ConfigMemberCard.MEMBER_CARD_TABLE_NAME + " Where " + ConfigMemberCard.COLUMN_MEMBERSHIP_ID + " = ?";

    public static final String TRANSACTION_SELECT_ALL_BY_ID = "Select * From " + ConfigTransaction.TRANSACTION_TABLE_NAME + " Where " + ConfigTransaction.COLUMN_TRANSACTION_ID + " = ?";

    public static final String CLASS_ACTIVITY_SELECT_ALL_BY_NAME = "Select * From " + ConfigClassActivity.CLASS_ACTIVITY_TABLE_NAME + " Where " + ConfigClassActivity.COLUMN_NAME + " = ?";
}
