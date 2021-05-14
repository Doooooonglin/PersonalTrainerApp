package com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.Member;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class MemberScreen extends AppCompatActivity {
    protected Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_screen);

        GlobalAppContextSingleton.getInstance().initialize(this);
    }

    public void EnterMemberName(String memberName) {
        AccessHandler handler = new AccessHandler();

        Member member = new Member();
        member = handler.RetrieveMemberInfo(memberName);
    }

    public MemberScreen(Context ctx) {
        this.ctx = ctx.getApplicationContext();
    }


}