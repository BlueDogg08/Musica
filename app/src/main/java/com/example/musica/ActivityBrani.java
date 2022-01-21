package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityBrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brani);

        Intent iRicevuta = getIntent();
        String brn = iRicevuta.getStringExtra("brn");
    }
}