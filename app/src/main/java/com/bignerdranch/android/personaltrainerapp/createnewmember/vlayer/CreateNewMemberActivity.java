package com.bignerdranch.android.personaltrainerapp.createnewmember.vlayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.bignerdranch.android.personaltrainerapp.R;

public class CreateNewMemberActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_member);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int posX = (int) event.getX();
        int posY = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "action down");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "action up");
                break;
        }
        return true;
    }
}