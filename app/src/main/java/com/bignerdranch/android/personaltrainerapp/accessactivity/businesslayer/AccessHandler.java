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
        mMemberCard = MemberCardDB.RetrieveMemberCardInfo(memberID);

        return mMemberCard;
    }

    public int CreateChargeSlip(int memberID, String memberName, String activityName) {
        Transaction transactionID = mMemberCard.CreateNewTransaction(memberID, memberName, activityName);

        return transactionID.getTransactionID();
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        mMemberCard.UpdateSlipSignature(transactionID, hasSignature);
    }
}
