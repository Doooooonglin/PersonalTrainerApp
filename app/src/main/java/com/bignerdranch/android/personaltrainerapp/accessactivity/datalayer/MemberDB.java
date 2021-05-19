package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.MemberScreen;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class MemberDB {
    public static Member RecordMemberInfo(String memberName) {
        DatabaseHelper helper = new DatabaseHelper(GlobalAppContextSingleton.getInstance().getApplicationContext());

        Cursor resultSet = helper.retrieveMember(memberName);

        Member member = new Member(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5),
                resultSet.getDouble(6),
                resultSet.getString(7),
                true
        );

        return member;
    }
}
