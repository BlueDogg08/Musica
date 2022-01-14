package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    private Button BtnCerca;
    private Button BtnAdd;
    private EditText TxtTitolo;
    private EditText TxtGenere;
    private EditText TxtAutore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gb = new GestioneBrani();
        TxtTitolo = (EditText) findViewById(R.id.TxtTitolo);
        TxtGenere = (EditText) findViewById(R.id.TxtGenere);
        TxtAutore = (EditText) findViewById(R.id.TxtAutore);

        BtnCerca = (Button)findViewById(R.id.BtnFind);
        BtnCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.toString();
            }
        });

        BtnAdd = (Button)findViewById(R.id.BtnAdd);
        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}