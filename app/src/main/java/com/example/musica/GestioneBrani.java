package com.example.musica;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class GestioneBrani {
    private List<Brano> lb;

    public GestioneBrani(){
        lb = new ArrayList<Brano>();
    }

    public void aggiungiBrano(String titolo, String autore, String genere){
        Brano br = new Brano(titolo, autore, genere);
        lb.add(br);
    }

    public String visualizzaTitoli(){
        StringBuilder sbBrani = new StringBuilder();

        for(Brano brc : lb){
            sbBrani.append(brc.getTitolo().toString());
            sbBrani.append(brc.getAutore().toString());
            sbBrani.append(brc.getGenere().toString());
        }

        return sbBrani.toString();
    }
}