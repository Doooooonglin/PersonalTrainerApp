package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;

public class Transaction {
    private int mTransactionID;
    private String mPaymentType;
    private double mAmount;
    private String mDate;
    private String mMemberName;
    private String mActivityName;
    private ChargeSlip mChargeSlip;

    public Transaction() {
    }

    public Transaction(int transactionID, String paymentType, double amount, String date) {
        mTransactionID = transactionID;
        mPaymentType = paymentType;
        mAmount = amount;
        mDate = date;
    }

    public int getTransactionID() {
        return mTransactionID;
    }

    public void setTransactionID(int transactionID) {
        mTransactionID = transactionID;
    }

    public String getPaymentType() {
        return mPaymentType;
    }

    public void setPaymentType(String paymentType) {
        mPaymentType = paymentType;
    }

    public double getAmount() {
        return mAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
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

    public ChargeSlip getChargeSlip() {
        return mChargeSlip;
    }

    public void setChargeSlip(ChargeSlip chargeSlip) {
        mChargeSlip = chargeSlip;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "mTransactionID=" + mTransactionID +
                ", mPaymentType='" + mPaymentType + '\'' +
                ", mAmount=" + mAmount +
                ", mDate='" + mDate + '\'' +
                ", mMemberName='" + mMemberName + '\'' +
                ", mActivityName='" + mActivityName + '\'' +
                ", mChargeSlip=" + mChargeSlip +
                '}';
    }

    public Transaction CreateNewTransaction(int membershipID, String memberName, String activityName) {
        return null;
    }
}
