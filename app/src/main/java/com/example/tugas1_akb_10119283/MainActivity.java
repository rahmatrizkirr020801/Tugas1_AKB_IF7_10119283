package com.example.tugas1_akb_10119283;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnprofile, btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogout = findViewById(R.id.btnlogout);
        btnprofile = findViewById(R.id.btnprofile);

        btnprofile.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
        });
        btnlogout.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
        });
    }
}
//nama    :Rahmatullah Rizki
//Nim     :10119283
//Kelas   :IF 7
//Tanggal :22-04-2022