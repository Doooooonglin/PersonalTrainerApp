package com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer;

import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.ClassActivity;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Member;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Transaction;

public class ChargeSlip {
    private int mTransactionID;
    private String mMemberName;
    private String mActivityName;
    private boolean mHasSignature;
    private double mAmount;
    private boolean mHasFllMembership;
    private String mDate;
    private ChargeSlip mSlip;

    public ChargeSlip() {
    }

    public ChargeSlip(int transactionID, String memberName, String activityName, boolean hasSignature, double amount, boolean hasFllMembership, String date) {
        mTransactionID = transactionID;
        mMemberName = memberName;
        mActivityName = activityName;
        mHasSignature = hasSignature;
        mAmount = amount;
        mHasFllMembership = hasFllMembership;
        mDate = date;
    }

    public int getTransactionID() {
        return mTransactionID;
    }

    public void setTransactionID(int transactionID) {
        mTransactionID = transactionID;
    }

    public String getMemberName() {
        return mMemberName;
    }

    public void setMemberName(String memberName) {
        mMemberName = memberName;
    }

    public String getActivityName() {
        return mActivityName;
    }

    public void setActivityName(String activityName) {
        mActivityName = activityName;
    }

    public boolean isHasSignature() {
        return mHasSignature;
    }

    public void setHasSignature(boolean hasSignature) {
        mHasSignature = hasSignature;
    }

    public double getAmount() {
        return mAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }

    public boolean isHasFllMembership() {
        return mHasFllMembership;
    }

    public void setHasFllMembership(boolean hasFllMembership) {
        mHasFllMembership = hasFllMembership;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public ChargeSlip getSlip() {
        return mSlip;
    }

    public void setSlip(ChargeSlip slip) {
        mSlip = slip;
    }

    public ChargeSlip createChargeSlip(Transaction transaction, boolean membershipType) {
        mSlip = new ChargeSlip(transaction.getTransactionID(), transaction.getMemberName(), transaction.getActivityName(), false, transaction.getAmount(), membershipType, transaction.getDate());

        return mSlip;
    }

    public void EnterSignature(int transactionID, boolean hasSignature) {
        mTransactionID = transactionID;

        if(mSlip.getTransactionID() == transactionID) {
            mSlip.setHasSignature(hasSignature);
        }
    }
}
