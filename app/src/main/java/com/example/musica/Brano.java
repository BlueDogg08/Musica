package com.example.musica;

import java.util.Date;

public class Brano {
    private String titolo;
    private String autore;
    private String genere;
    private String urlVideo;
    private int durata;
    private Date dataLancio;

    public Brano(String titolo, String autore, String genere){
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public String getGenere() {
        return this.genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
