package com.example.saveuistates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTvText;
    private Button mBtnClickHere;
    private EditText mEtType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnClickHere = findViewById(R.id.btnClickHere);
        mTvText = findViewById(R.id.tvClick);
        mEtType = findViewById(R.id.etType);
        mBtnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvText.setText("ButtonClicked");
            }
        });
        mEtType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEtType.getText().toString().trim().length() > 6) {
                    Toast.makeText(MainActivity.this,"MasaiSchool",Toast.LENGTH_SHORT).show();
            }
        }
    });
}}