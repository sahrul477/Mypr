package com.example.mypr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class acion_bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acion_bar);

        final TextView nmdepan = (TextView) findViewById(R.id.actionbarnmdepan);
        final TextView namabelakang = (TextView) findViewById(R.id.actionbarnmbelakang);

        Intent i = getIntent();
        nmdepan.setText(i.getStringExtra("i_nama_awal"));
        namabelakang.setText(i.getStringExtra("i_nama_akhir"));

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
