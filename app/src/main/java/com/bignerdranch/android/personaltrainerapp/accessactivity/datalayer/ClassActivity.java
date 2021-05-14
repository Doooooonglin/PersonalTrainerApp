package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import java.util.List;

public class ClassActivity {
    private String mName;
    private String mType;
    private String mTime;
    private int mRoomID;
    private List<Member> mRegisteredMembers;

    public ClassActivity() {
    }

    public ClassActivity(String name, String type, String time, int roomID) {
        mName = name;
        mType = type;
        mTime = time;
        mRoomID = roomID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public int getRoomID() {
        return mRoomID;
    }

    public void setRoomID(int roomID) {
        mRoomID = roomID;
    }

    public List<Member> getRegisteredMembers() {
        return mRegisteredMembers;
    }

    public void setRegisteredMembers(List<Member> registeredMembers) {
        mRegisteredMembers = registeredMembers;
    }

    @Override
    public String toString() {
        return "ClassActivity{" +
                "mName='" + mName + '\'' +
                ", mType='" + mType + '\'' +
                ", mTime='" + mTime + '\'' +
                ", mRoomID=" + mRoomID +
                ", mRegisteredMembers=" + mRegisteredMembers +
                '}';
    }
}
