package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.database.Cursor;

import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

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

    public Transaction CreateNewTransaction(String memberName, String activityName, String paymentType, double amount, String date, String memberType) {
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

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        mChargeSlip.EnterSignature(transactionID, hasSignature);
    }
}
