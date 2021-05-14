package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class MemberCardDB {
    public static MemberCard RetrieveMemberCardInfo(int membershipID) {
        DatabaseHelper helper = new DatabaseHelper(GlobalAppContextSingleton.getInstance().getApplicationContext());

        Cursor resultSet = helper.retrieveMembercard(membershipID);

        MemberCard card = new MemberCard(
                resultSet.getInt(1),
                resultSet.getString(2)
        );
        card.setMembership(MembershipDB.GetMembershipInfo(membershipID));

        return card;
    }
}
