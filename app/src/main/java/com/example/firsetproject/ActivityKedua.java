package com.example.firsetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv = findViewById(R.id.tv_nama);
        TextView td = findViewById(R.id.tv_alamat);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null){
            return;
        }

        String nama = ambil.getString("nama");
        String alamat = ambil.getString("alamat");
        String ttl = ambil.getString("ttl");
        if (nama != null){
            tv.setText(nama);
        }
        if (alamat != null){
            td.setText(alamat);
        }
        if (ttl != null){
            td.setText(ttl);
        }
    }
}