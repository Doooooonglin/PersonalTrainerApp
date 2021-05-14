package com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Member;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberCard;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberCardDB;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberDB;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Membership;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MembershipDB;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Transaction;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

public class AccessHandler {
    private int mTransactionID;
    private Member mMember;
    private MemberCard mMemberCard;

    public Member RetrieveMemberInfo(String memberName) {
        mMember = MemberDB.RecordMemberInfo(memberName);

        return mMember;
    }

    public MemberCard RetrieveMemberCardInfo(int memberID) {
        mMemberCard = new MemberCard();
        mMemberCard = mMemberCard.RetrieveMemberCardInfo(memberID);

        return mMemberCard;
    }

    public int CreateChargeSlip(String memberName, String activityName, String paymentType, double amount, String date, String memberType) {
        Transaction transaction = mMemberCard.CreateNewTransaction(memberName, activityName, paymentType, amount, date, memberType);

        return transaction.getTransactionID();
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        mMemberCard.UpdateSlipSignature(transactionID, hasSignature);
    }
}
