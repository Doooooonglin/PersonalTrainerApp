package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class MemberCard {
    private int mMembershipID;
    private String mPhotoDir;
    private Membership mMembership;
    private Transaction mTransaction;

    public MemberCard() {
    }

    public MemberCard(int membershipID, String photoDir) {
        mMembershipID = membershipID;
        mPhotoDir = photoDir;
    }

    public int getMembershipID() {
        return mMembershipID;
    }

    public void setMembershipID(int membershipID) {
        mMembershipID = membershipID;
    }

    public String getPhotoDir() {
        return mPhotoDir;
    }

    public void setPhotoDir(String photoDir) {
        mPhotoDir = photoDir;
    }

    public Membership getMembership() {
        return mMembership;
    }

    public void setMembership(Membership membership) {
        mMembership = membership;
    }

    public Transaction getTransaction() {
        return mTransaction;
    }

    public void setTransaction(Transaction transaction) {
        mTransaction = transaction;
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "mMembershipID=" + mMembershipID +
                ", mPhotoDir='" + mPhotoDir + '\'' +
                ", mMembership=" + mMembership +
                ", mTransaction=" + mTransaction +
                '}';
    }

    public MemberCard RetrieveMemberCardInfo(int membershipID) {
        DatabaseHelper helper = new DatabaseHelper(GlobalAppContextSingleton.getInstance().getApplicationContext());

        Cursor resultSet = helper.retrieveMembercard(membershipID);

        MemberCard card = new MemberCard(
                resultSet.getInt(1),
                resultSet.getString(2)
        );
        Membership membership = MembershipDB.GetMembershipInfo(membershipID);
        card.setMembership(membership);

        return card;
    }

    public Transaction CreateNewTransaction(String memberName, String activityName, String paymentType, double amount, String date, String memberType) {
        mTransaction = new Transaction();
        mTransaction = mTransaction.CreateNewTransaction(memberName, activityName, paymentType, amount, date, memberType);

        return mTransaction;
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        mTransaction.UpdateSlipSignature(transactionID, hasSignature);
    }
}
