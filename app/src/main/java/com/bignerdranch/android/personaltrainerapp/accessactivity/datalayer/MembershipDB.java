package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

public class MembershipDB {
    public static Membership GetMembershipInfo(int membershipID) {
        DatabaseHelper helper = new DatabaseHelper(null);

        Cursor resultSet = helper.retrieveMembership(membershipID);

        Membership newMembership = new Membership(
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5)
        );

        return newMembership;
    }
}
