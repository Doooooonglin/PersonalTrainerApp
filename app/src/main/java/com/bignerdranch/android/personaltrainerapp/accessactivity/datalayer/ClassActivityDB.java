package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class ClassActivityDB {
    public static ClassActivity RecordClassActivityInfo(String activityName) {
        DatabaseHelper helper = new DatabaseHelper(GlobalAppContextSingleton.getInstance().getApplicationContext());

        Cursor resultSet = helper.retrieveClassActivity(activityName);

        ClassActivity activity = new ClassActivity(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getInt(4)
        );

        return activity;
    }
}
