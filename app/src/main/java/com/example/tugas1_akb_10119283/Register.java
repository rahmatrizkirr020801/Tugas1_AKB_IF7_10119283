package com.example.tugas1_akb_10119283;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    TextView text_login;
    private Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnregister = findViewById(R.id.btnregister);

        text_login=(TextView)findViewById(R.id.text_login);
        text_login.setOnClickListener(v -> {
                Intent intent=new Intent(Register.this, Login.class);
                startActivity(intent);
        });
        btnregister.setOnClickListener(v -> {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
        });
    }
}
//nama    :Rahmatullah Rizki
//Nim     :10119283
//Kelas   :IF 7
//Tanggal :22-04-2022