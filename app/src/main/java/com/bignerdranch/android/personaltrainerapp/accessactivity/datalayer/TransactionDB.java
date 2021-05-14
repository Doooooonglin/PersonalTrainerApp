package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

public class TransactionDB {
    public static Transaction CreateNewTransaction(String memberName, String activityName, String paymentType, double amount, String date, String memberType) {
        Member member = MemberDB.RecordMemberInfo(memberName);

        ClassActivity activity = ClassActivityDB.RecordClassActivityInfo(activityName);

        DatabaseHelper helper = new DatabaseHelper(null);

        helper.insertTransactionData(1, paymentType, amount, date);

        Cursor resultSet = helper.getTransaction(1);

        Transaction transaction = new Transaction(
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getDouble(3),
                resultSet.getString(4)
        );
        transaction.setMemberName(member.getName());
        transaction.setActivityName(activity.getName());

        boolean hasFullMembership = memberType == "Full" ? true : false;

        ChargeSlip slip = new ChargeSlip();

        transaction.setChargeSlip(slip.createChargeSlip(transaction, hasFullMembership));

        return transaction;
    }
}
