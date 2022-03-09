package com.company;

public class Musica implements Comparable<Musica> {

    private String nomeMusica;
    private String nomeCantor;

    public Musica(String nomeMusica, String nomeCantor) {
        this.nomeMusica = nomeMusica;
        this.nomeCantor = nomeCantor;
    }


    public int compareTo(Musica o) {
        int comparacaoMusicas = this.nomeMusica.compareToIgnoreCase(o.getNomeMusica());
        if (comparacaoMusicas == 0) {
            return this.nomeCantor.compareToIgnoreCase(o.getNomeCantor());
        }
        return comparacaoMusicas;
    }


    public String getNomeMusica() {
        return nomeMusica;
    }


    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }


    public String getNomeCantor() {
        return nomeCantor;
    }


    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }


    public String toString(){
        return this.nomeMusica + " ["+this.nomeCantor +"]";
    }
}