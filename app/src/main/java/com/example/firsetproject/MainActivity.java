package com.example.firsetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHW = findViewById(R.id.tvhw);
        final TextView txtNama = findViewById(R.id.tv_1);
        final TextView txtAlamat = findViewById(R.id.tv_2);
        final TextView txtTtl = findViewById(R.id.tv_3);
        final TextView txtEmail = findViewById(R.id.tv_4);
        final TextView txtNo = findViewById(R.id.tv_5);
        Button btnMove = findViewById(R.id.btn_pindah);


        txtNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan"+txtNama.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat", Toast.LENGTH_SHORT).show();
            }
        });

        txtHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(MainActivity.this, "Anda CLICK sebanyak " + jumlah + "kali", Toast.LENGTH_SHORT).show();
            }
        });

        txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "anda CLICK "+txtEmail, Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityKedua.class);
                intent.putExtra("nama",txtNama.getText());
                intent.putExtra("alamat",txtAlamat.getText());
                intent.putExtra("ttl",txtTtl.getText());
                startActivity(intent);
//                finish();
//                onDestroy();

            }
        });


    }

    public void submitRegist(View view){
        Intent hubung = new Intent(this, ActivityKedua.class);
//        hubung.putExtra("nama",.getText().toString());


    }
}