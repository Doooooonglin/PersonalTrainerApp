package com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberCard;

public class CardScanScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_scan_screen);
    }

    public void retrieveMemberCardInfo(int membershipID) {
        AccessHandler handler = new AccessHandler();

        MemberCard card = new MemberCard();
        card = handler.RetrieveMemberCardInfo(membershipID);
    }

    public void createChargeSlip(int membershipID, String memberName, String activityName) {
        AccessHandler handler = new AccessHandler();

        int newSlip = handler.CreateChargeSlip(membershipID, memberName, activityName);
    }
}