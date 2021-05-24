package com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Schedule;
import com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.ReserveScheduleActivity;
import java.time.Instant;
import java.util.Calendar;


public class ScheduleDB<update> extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    TextView tvDesc;
    TextView tvReserve;
    private Schedule schedule;
    private String dayStr, timeStr;
    private Instant Glide;


    protected int getLayoutId() {
        return R.layout.activity_schedule_detail;
    }

public void onClick(View v){
        initDialog();
}

    private void initDialog() {
    }

    protected void setUpView() {
        schedule = ( Schedule) getIntent().getSerializableExtra("entity");
        tvDesc.setText(String.format("%s\n%s", schedule.getName(), schedule.getContent()));
    }

    public Intent getIntent() {
        return null;
    }



    public void onClick() {
        initDialog();

    }


    private void initDialog(Bundle savedInstanceState) {
        View dialogView = LayoutInflater.from(ScheduleDB.this).inflate(R.layout.schedule_dialog, null);
        final TextView day = dialogView.findViewById(R.id.et_day);
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                DatePickerDialog dialog = new DatePickerDialog(ScheduleDB.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        dayStr = String.format("%s Year %s Month%s Day", year, month, dayOfMonth);
                    }
                },
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH));
                dialog.show();

            }
        });
        RadioButton rbMorning = ((View) dialogView).findViewById(R.id.rb_morning);
        RadioButton rbAfternorr = dialogView.findViewById(R.id.rb_afternooe);
        rbMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeStr = "Morning";
            }
        });
        rbAfternorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeStr = "Afternoon";
            }
        });

        new AlertDialog.Builder(ScheduleDB.this)
                .setView(dialogView)
                .setNegativeButton("Submit", new DialogInterface.OnClickListener() {


                    public void onClick(final DialogInterface dialog, int which) {
                        schedule.setState(1);
                        schedule.setTime(dayStr + timeStr);

                    }
                })
                .setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}




