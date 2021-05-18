package com.bignerdranch.android.personaltrainerapp;

import androidx.appcompat.app.AppCompatActivity;

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

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.DatabaseHelper;

public class CreateNewMemberActivity extends AppCompatActivity implements View.OnClickListener{

    private DatabaseHelper dbHelper;
    private EditText edttxtName, editTextAddress,editTextPhoneNum,editTextEmail;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonGender;
    private SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_member);
        edttxtName = findViewById(R.id.edt_form_info_name);
        editTextAddress = findViewById(R.id.edt_form_info_address);
        radioGroupGender = findViewById(R.id.edt_form_info_gender_radio_group);

        editTextPhoneNum = findViewById(R.id.edt_form_info_phone);
        editTextEmail = findViewById(R.id.edt_form_info_email);

        dbHelper = new DatabaseHelper(CreateNewMemberActivity.this);
        sqLiteDatabase = dbHelper.getWritableDatabase();
    }

//    add buttonclicked to insert myDBHelper.insertTable(name,address,gender,etc);


//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        int posX = (int) event.getX();
//        int posY = (int) event.getY();
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.i("TAG", "action down");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.i("TAG", "action up");
//                break;
//        }
//        return true;
//    }


    @Override
    public void onClick(View v) {
        String mName = edttxtName.getText().toString();
        String mAddress = editTextAddress.getText().toString();
        int mGenderId = radioGroupGender.getCheckedRadioButtonId();
        radioButtonGender = (RadioButton) findViewById(mGenderId);
        String mGender = radioButtonGender.getText().toString();

        String mPhoneNum = editTextPhoneNum.getText().toString();
        String mEmail = editTextEmail.getText().toString();

        dbHelper.insertMember(mName,mAddress,mGender,mPhoneNum,mEmail);
    }
}