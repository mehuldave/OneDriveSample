package com.example.onedrivesample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onedrivesample.R;
import com.example.onedrivesample.database.DBHelper;

public class TestActivity extends AppCompatActivity {

    Button btnFillFormOne,btnFillFormTwo,btnFillFormThree;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        dbHelper = new DBHelper(this);
        btnFillFormOne=findViewById(R.id.btnFillFormOne);
        btnFillFormTwo=findViewById(R.id.btnFillFormTwo);
        btnFillFormThree=findViewById(R.id.btnFillFormThree);

        btnFillFormOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestActivity.this, AdminFillupActivity.class);
                intent.putExtra("type", "1");
                startActivity(intent);
            }
        });

        btnFillFormTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestActivity.this, AdminFillupActivity.class);
                intent.putExtra("type", "2");
                startActivity(intent);
            }
        });

        btnFillFormThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestActivity.this, AdminFillupActivity.class);
                intent.putExtra("type", "3");
                startActivity(intent);
            }
        });
    }
}