package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    Button BtnCerca;
    Button BtnAdd;
    EditText TxtTitolo;
    EditText TxtGenere;
    EditText TxtAutore;
    Spinner SpnGeneri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] genMusicali = {"Pop", "Metal", "Rock", "Trap"};

        gb = new GestioneBrani();
        TxtTitolo = (EditText) findViewById(R.id.TxtTitolo);
        TxtGenere = (EditText) findViewById(R.id.TxtGenere);
        TxtAutore = (EditText) findViewById(R.id.TxtAutore);

        BtnCerca = (Button) findViewById(R.id.BtnFind);
        BtnAdd = (Button) findViewById(R.id.BtnAdd);

        SpnGeneri = (Spinner) findViewById(R.id.SpnGeneri);
        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genMusicali);
        SpnGeneri.setAdapter(aaG);


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

                /*Toast.makeText(getApplicationContext(), generesel, Toast.LENGTH_LONG).show();*/
                String tit = TxtAutore.getText().toString());
                String aut = TxtTitolo.getText().toString());
                String generesel = SpnGeneri.getSelectedItem().toString();
                gb.aggiungiBrano(tit, aut, generesel);
            }
        });
    }
}