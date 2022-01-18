package com.example.musica;

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
}