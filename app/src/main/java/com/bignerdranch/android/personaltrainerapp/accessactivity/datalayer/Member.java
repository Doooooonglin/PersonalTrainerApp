package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import java.util.Date;

public class Member {
    private String mName;
    private String mAddress;
    private char mGender;
    private String mPhoneNum;
    private String mEmail;
    private double mFee;
    private String mLastPayment;
    private boolean mIsActive;

    public Member() {
    }

    public Member(String name, String address, char gender, String phoneNum, String email, double fee, String lastPayment, boolean isActive) {
        mName = name;
        mAddress = address;
        mGender = gender;
        mPhoneNum = phoneNum;
        mEmail = email;
        mFee = fee;
        mLastPayment = lastPayment;
        mIsActive = isActive;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public char getGender() {
        return mGender;
    }

    public void setGender(char gender) {
        mGender = gender;
    }

    public String getPhoneNum() {
        return mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        mPhoneNum = phoneNum;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public double getFee() {
        return mFee;
    }

    public void setFee(double fee) {
        mFee = fee;
    }

    public String getLastPayment() {
        return mLastPayment;
    }

    public void setLastPayment(String lastPayment) {
        mLastPayment = lastPayment;
    }

    public boolean isActive() {
        return mIsActive;
    }

    public void setActive(boolean active) {
        mIsActive = active;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mGender=" + mGender +
                ", mPhoneNum='" + mPhoneNum + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mFee=" + mFee +
                ", mLastPayment='" + mLastPayment + '\'' +
                ", mIsActive=" + mIsActive +
                '}';
    }

    public Member RecordMemberInfo(String memberName) {
        return null;
    }
}
