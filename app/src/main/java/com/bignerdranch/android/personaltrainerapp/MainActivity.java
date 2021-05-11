package com.bignerdranch.android.personaltrainerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.AccessActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Declare fields for the widgets
    private Button mAccessActivityButton, mCreateNewMemberButton, mReserveScheduleButton;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAccessActivityButton = (Button)findViewById(R.id.access_activity_btn);
        mCreateNewMemberButton = (Button)findViewById(R.id.create_new_member_btn);
        mReserveScheduleButton = (Button)findViewById(R.id.reserve_a_schedule_btn);

        mAccessActivityButton.setOnClickListener(this::onClick);
        mCreateNewMemberButton.setOnClickListener(this::onClick);
        mReserveScheduleButton.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.access_activity_btn) {
            mIntent = new Intent(MainActivity.this, AccessActivity.class);

            startActivity(mIntent);
        }
        else if(v.getId() == R.id.create_new_member_btn) {
            mIntent = new Intent(MainActivity.this, CreateNewMemberActivity.class);

            startActivity(mIntent);
        }
        else if(v.getId() == R.id.reserve_a_schedule_btn) {
            mIntent = new Intent(MainActivity.this, ReserveScheduleActivity.class);
        }
    }
}