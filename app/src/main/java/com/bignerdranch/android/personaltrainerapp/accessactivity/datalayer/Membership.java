package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

public class Membership {
    private int mMemberID;
    private String mSignUpDate;
    private String mExpiryDate;
    private String PaymentPlan;
    private String Type;

    public Membership() {
    }

    public Membership(int memberID, String signUpDate, String expiryDate, String paymentPlan, String type) {
        mMemberID = memberID;
        mSignUpDate = signUpDate;
        mExpiryDate = expiryDate;
        PaymentPlan = paymentPlan;
        Type = type;
    }

    public int getMemberID() {
        return mMemberID;
    }

    public void setMemberID(int memberID) {
        mMemberID = memberID;
    }

    public String getSignUpDate() {
        return mSignUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        mSignUpDate = signUpDate;
    }

    public String getExpiryDate() {
        return mExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        mExpiryDate = expiryDate;
    }

    public String getPaymentPlan() {
        return PaymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        PaymentPlan = paymentPlan;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "mMemberID=" + mMemberID +
                ", mSignUpDate='" + mSignUpDate + '\'' +
                ", mExpiryDate='" + mExpiryDate + '\'' +
                ", PaymentPlan='" + PaymentPlan + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

    public Membership GetMembershipInfo(int membershipID) {
        return null;
    }
}
