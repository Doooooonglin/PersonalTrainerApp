package com.bignerdranch.android.personaltrainerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Schedule;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.ScheduleDB;
import com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.ReserveScheduleActivity;

import java.util.List;

public class ScheduleScreen<CustomApplication, Course, Query> extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {



    RecyclerView rvList;
    private Object List;


    protected int getLayoutId() {
        return R.layout.schedule_reserved;
    }


    protected void setUpView() {
        this.setTitle("My Reserve");
    }

    private void initData(final Exception e) {

        if (e == null) {
            ReserveScheduleActivity screen = new ReserveScheduleActivity((java.util.List<Schedule>) List, ScheduleScreen.this);
            RecyclerView.Adapter scheduleReserved = null;
            rvList.setAdapter(scheduleReserved);
            rvList.setLayoutManager(new LinearLayoutManager(ScheduleScreen.this));
            screen.setReserveClickListener(new ReserveScheduleActivity.OnReserveClickListener() {

                public void onClick(Schedule schedule) {
                    if (schedule.getState() == 1) {
                        Toast.makeText(ScheduleScreen.this, "This time has already been reserved, please choose another one!", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(ScheduleScreen.this, Schedule.class);
                        intent.putExtra("entity", (Parcelable) scheduleReserved);
                        startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }


}