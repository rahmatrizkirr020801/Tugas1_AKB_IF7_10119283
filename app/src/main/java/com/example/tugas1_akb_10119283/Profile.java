package com.example.tugas1_akb_10119283;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    private Button btnkembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnkembali = findViewById(R.id.btnkembali);

        btnkembali.setOnClickListener(v -> {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
        });
    }
}
//nama    :Rahmatullah Rizki
//Nim     :10119283
//Kelas   :IF 7
//Tanggal :22-04-2022