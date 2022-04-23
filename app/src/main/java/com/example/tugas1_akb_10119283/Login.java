package com.example.tugas1_akb_10119283;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextView text_registrasi;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = findViewById(R.id.btnlogin);

        text_registrasi=(TextView)findViewById(R.id.text_registrasi);
        text_registrasi.setOnClickListener(v -> {
                Intent intent=new Intent(Login.this, Register.class);
                startActivity(intent);
        });

        btnlogin.setOnClickListener(v -> {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
        });
    }
}
//nama    :Rahmatullah Rizki
//Nim     :10119283
//Kelas   :IF 7
//Tanggal :22-04-2022