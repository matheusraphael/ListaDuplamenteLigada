package com.company;

public class Playlist {

    ListaDuplamenteLigada<Musica> listaDeMusicas;

    public Playlist() {
        listaDeMusicas = new ListaDuplamenteLigada<>();
    }

    public void adicionaMusica(String nomeMusica, String nomeCantor) {
        this.listaDeMusicas.insere(new Musica(nomeMusica, nomeCantor));
    }

    public void removerMusica(String nomeMusica, String nomeCantor) {
        this.listaDeMusicas.remove(new Musica(nomeMusica, nomeCantor));
    }

    public Musica avancaMusica(Musica musica) {
        No<Musica> musicaBuscada = listaDeMusicas.buscaNo(musica);
        if (musicaBuscada != null) {
            return musicaBuscada.getProximo().getChave();
        }
        return null;
    }

    public Musica retrocederMusica(Musica musica) {
        No<Musica> musicaBuscada = listaDeMusicas.buscaNo(musica);
        if (musicaBuscada != null) {
            return musicaBuscada.getAnterior().getChave();
        }
        return null;
    }

    public void imprime() {
        No<Musica> ponteiroMusica = this.listaDeMusicas.getInicio();
        System.out.println("-----------------PlayList-----------------");
        if (!this.listaDeMusicas.estaVazia()) {
            do {
                System.out.println(ponteiroMusica.getChave().toString());
                ponteiroMusica = ponteiroMusica.getProximo();
            } while (ponteiroMusica != this.listaDeMusicas.getInicio());
        }
        System.out.println("-------------------------------------------\n");
    }
}