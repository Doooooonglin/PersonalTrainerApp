package com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer;

public class ChargeSlip {
    private int mTransactionID;
    private boolean mHasSignature;
    private double mAmount;
    private boolean mHasFllMembership;
    private String mDate;

    public ChargeSlip() {
    }

    public ChargeSlip(int transactionID, boolean hasSignature, double amount, boolean hasFllMembership, String date) {
        mTransactionID = transactionID;
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

    @Override
    public String toString() {
        return "ChargeSlip{" +
                "mTransactionID=" + mTransactionID +
                ", mHasSignature=" + mHasSignature +
                ", mAmount=" + mAmount +
                ", mHasFllMembership=" + mHasFllMembership +
                ", mDate='" + mDate + '\'' +
                '}';
    }
}