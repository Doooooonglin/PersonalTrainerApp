


package com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens;

        import android.content.Context;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Schedule;

        import java.util.List;

public class ReserveScheduleActivity extends AppCompatActivity {


    TextView tvName;
    TextView tvContent;
    TextView tvTime;
    TextView tvReserve;

    public void setReserveClickListener(com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.ReserveScheduleActivity.OnReserveClickListener reserveClickListener) {
        this.reserveClickListener = reserveClickListener;
    }

    private com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens.ReserveScheduleActivity.OnReserveClickListener reserveClickListener;


    public ReserveScheduleActivity(List<Schedule> mDatas, Context context) {
        super();
    }


    protected void converData(final Schedule schedule, int position) {
        tvName.setText(schedule.getName());
        tvContent.setText(schedule.getContent());
        tvTime.setText(schedule.getTime());
        tvReserve.setText(schedule.getState() == 1 ? "Already reserved" : "Reserve");
        tvReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reserveClickListener != null) {
                    reserveClickListener.onClick(schedule);
                }
            }
        });
    }

    public int getItemLayoutId() {
        return com.bignerdranch.android.personaltrainerapp.R.layout.schedule_item ;
    }


    public interface OnReserveClickListener {
        void onClick(Schedule schedule);
    }
}

