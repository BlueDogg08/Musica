package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    private Button BtnCerca;
     Button BtnAdd;
     EditText TxtTitolo;
     EditText TxtGenere;
    EditText TxtAutore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gb = new GestioneBrani();
        TxtTitolo = (EditText) findViewById(R.id.TxtTitolo);
        TxtGenere = (EditText) findViewById(R.id.TxtGenere);
        TxtAutore = (EditText) findViewById(R.id.TxtAutore);

        BtnCerca = (Button)findViewById(R.id.BtnFind);
        BtnAdd = (Button)findViewById(R.id.BtnAdd);

        BtnCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aut = gb.visualizzaAutore(TxtAutore.getText().toString());
                Toast.makeText(getApplicationContext(), aut, Toast.LENGTH_LONG).show();
            }
        });

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tit = (TxtTitolo.getText().toString());
            }
        });
    }
}