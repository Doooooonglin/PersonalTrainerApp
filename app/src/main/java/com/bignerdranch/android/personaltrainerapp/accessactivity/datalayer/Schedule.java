package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

public class Schedule {
    private String name;
    private String content;
    private int state;
    private String time;
    private String reserve;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String content) {
        this.reserve = reserve;
    }


}
