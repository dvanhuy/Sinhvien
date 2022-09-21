package com.example.sinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ten,masv;
    SinhVien sinhVien;
    Button nhap,huy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        nhap = findViewById(R.id.button);
        huy = findViewById(R.id.button2);
        ten = findViewById(R.id.ten);
        masv = findViewById(R.id.masv);
        sinhVien = new SinhVien(ten.getText().toString(),masv.getText().toString());

        nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("sinhvien",sinhVien);
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });
    }
}