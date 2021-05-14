package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

public class TransactionDB {
    public static Transaction CreateNewTransaction(int membershipID, String memberName, String activityName) {
        Member member = MemberDB.RecordMemberInfo(memberName);

        ClassActivity activity = ClassActivityDB.RecordClassActivityInfo(activityName);

        DatabaseHelper helper = new DatabaseHelper(null);

        helper.insertTransactionData(1, "type", 1f, "date");

        Cursor resultSet = helper.getTransaction(1);

        Transaction transaction = new Transaction(
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getDouble(3),
                resultSet.getString(4)
        );
        transaction.setMemberName(member.getName());
        transaction.setActivityName(activity.getName());

        ChargeSlip slip = new ChargeSlip();

        transaction.setChargeSlip(slip.createChargeSlip(transaction));

        return transaction;
    }
}
