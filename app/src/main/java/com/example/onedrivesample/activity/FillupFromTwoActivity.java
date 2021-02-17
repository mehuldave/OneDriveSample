package com.example.onedrivesample.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onedrivesample.R;
import com.example.onedrivesample.database.DBHelper;
import com.example.onedrivesample.model.AdminRecord;

import java.util.ArrayList;

public class FillupFromTwoActivity extends AppCompatActivity {

    DBHelper dbHelper;
    ImageView imgAdd,backBtn;
    RecyclerView rv_list;
    String strType="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillup_two);

        dbHelper = new DBHelper(this);
        imgAdd=findViewById(R.id.imgAdd);
        rv_list=findViewById(R.id.rv_list);
        backBtn=findViewById(R.id.backBtn);

        strType = getIntent().getStringExtra("type");

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CustomDialogAdd();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}