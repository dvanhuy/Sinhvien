package com.example.sinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button back;
    SinhVien sinhVien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        Intent intent =  getIntent();
        Bundle bundle  = new Bundle();
        bundle= intent.getBundleExtra("bundle");
        sinhVien = (SinhVien) bundle.getSerializable("sinhvien");
        textView=findViewById(R.id.textView8);
        textView.setText(sinhVien.getTen()+"asdasdasd");
        back = findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}