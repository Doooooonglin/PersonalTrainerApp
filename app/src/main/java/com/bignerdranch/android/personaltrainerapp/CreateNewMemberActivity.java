package com.bignerdranch.android.personaltrainerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

import java.io.Console;

public class CreateNewMemberActivity extends AppCompatActivity implements View.OnTouchListener{

    private DatabaseHelper dbHelper;
    private EditText editTextName, editTextAddress,editTextPhoneNum,editTextEmail;
    private String mName, mAddress, mGender, mPhoneNum,mEmail,mLastPayment;
    private double mFee;
    private boolean mIsValid;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonGender;
    private SQLiteDatabase sqLiteDatabase;
    Button submit_member_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_member);
        editTextName = findViewById(R.id.edt_form_info_name);
        editTextAddress = findViewById(R.id.edt_form_info_address);
        radioGroupGender = findViewById(R.id.edt_form_info_gender_radio_group);
        editTextPhoneNum = findViewById(R.id.edt_form_info_phone);
        editTextEmail = findViewById(R.id.edt_form_info_email);
        dbHelper = new DatabaseHelper(CreateNewMemberActivity.this);
        sqLiteDatabase = dbHelper.getWritableDatabase();
        submit_member_btn = (Button) findViewById(R.id.submit_member_btn);
        submit_member_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register(){
        initialize();

        if(!validate()) {

            Log.d("STATE", "Row insertion failed");
        }
        else{
            long rowId = dbHelper.insertMember(mName, mAddress, mGender, mPhoneNum, mEmail,mFee, mLastPayment, mIsValid);
            if(rowId == -1){
                Log.d("STATE", "Row insertion failed");
            }
            else
            Log.d("STATE", "Row:" + rowId + " insertion successful.");
        }
    }

    public boolean validate() {
        boolean valid = true;
        if (mName.isEmpty()) {
            editTextName.setError("Please enter a name.");
            valid = false;
        }
        if (mAddress.isEmpty()) {
            editTextAddress.setError("Please enter a valid address.");
            valid = false;
        }
        if (mPhoneNum.isEmpty()) {
            editTextPhoneNum.setError("Please enter a valid phone number.");
            valid = false;
        }
        if (mEmail.isEmpty()) {
            editTextEmail.setError("Please enter a valid address.");
            valid = false;
        }
        return valid;
    }
        private void initialize() {
            mName = editTextName.getText().toString().trim();
            mAddress = editTextAddress.getText().toString();

            int mGenderId = radioGroupGender.getCheckedRadioButtonId();
            radioButtonGender = (RadioButton) findViewById(mGenderId);
            mGender = radioButtonGender.getText().toString();

            mPhoneNum = editTextPhoneNum.getText().toString();
            mEmail = editTextEmail.getText().toString();
            mFee = 1.00;
            mLastPayment= "Test Last Payment ";
            mIsValid = true;

        }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
