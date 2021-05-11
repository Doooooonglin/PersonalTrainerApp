package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

public class MemberCard {
    private int mMembershipID;
    private String mPhotoDir;
    private int mTransactionID;
    private boolean mHasSignature;
    private String mMemberName;
    private String mActivityName;
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
                ", mTransactionID=" + mTransactionID +
                ", mHasSignature=" + mHasSignature +
                ", mMemberName='" + mMemberName + '\'' +
                ", mActivityName='" + mActivityName + '\'' +
                ", mMembership=" + mMembership +
                ", mTransaction=" + mTransaction +
                '}';
    }

    public Membership RetrieveMemberCardInfo(int membershipID) {
        return null;
    }

    public Transaction CreateNewTransaction(int membershipID, String memberName, String activityName) {
        return null;
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {

    }
}
