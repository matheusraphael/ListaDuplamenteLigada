package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Playlist playlist = new Playlist();
        int numDeMusicaAseremTocadas, opcao;
        String musicaCantor[], navegador;
        numDeMusicaAseremTocadas = Integer.parseInt(br.readLine());

        while (numDeMusicaAseremTocadas > 0) {
            musicaCantor = br.readLine().split("--");
            playlist.adicionaMusica(musicaCantor[0], musicaCantor[1]);
            numDeMusicaAseremTocadas--;
        }
        playlist.imprime();

        musicaCantor = br.readLine().split("--");

        opcao = Integer.parseInt(br.readLine());
        Musica musicaEscolhida;
        musicaEscolhida = new Musica(musicaCantor[0], musicaCantor[1]);
        switch (opcao) {
            case 1:
                navegador = br.readLine();
                do {
                    if (navegador.equals(">>")) {
                        musicaEscolhida = playlist.avancaMusica(musicaEscolhida);
                        System.out.print(">> ");
                    }
                    if (navegador.equals("<<")) {
                        musicaEscolhida = playlist.retrocederMusica(musicaEscolhida);
                        System.out.print("<< ");
                    }
                    System.out.println(musicaEscolhida.toString());
                    navegador = br.readLine();
                } while (!navegador.equalsIgnoreCase("0"));
                break;
            case 2:
                playlist.removerMusica(musicaCantor[0], musicaCantor[1]);
                playlist.imprime();
                break;
            default:
                break;

//        BufferedReader br;
//        br = new BufferedReader(new InputStreamReader(System.in));
//        Playlist playlist = new Playlist();
//        int numeroDeMusicasAseremTocadas;
//        int opcao;
//        String  musicaCantor[] ;
//        String navegar;
//        numeroDeMusicasAseremTocadas = Integer.parseInt(br.readLine());
//
//        while (numeroDeMusicasAseremTocadas>0){
//            musicaCantor = br.readLine().split("--");
//            playlist.adicionaMusica(musicaCantor[0],musicaCantor[1]);
//            numeroDeMusicasAseremTocadas--;
//        }
//        playlist.imprime();
//
//        musicaCantor = br.readLine().split("--");
//
//        opcao = Integer.parseInt(br.readLine());
//        Musica musicaNova;
//        musicaNova= new Musica(musicaCantor[0],musicaCantor[1]);
//
//        switch (opcao){
//            case 1:
//                navegar = br.readLine();
//                do {
//                    if (navegar.equals(">>")){
//                        musicaNova = playlist.avancaMusica(musicaNova);
//                        System.out.println(">> ");
//                    }
//                    if (navegar.equals("<<")){
//                        musicaNova = playlist.retrocederMusica(musicaNova);
//                        System.out.println("<< ");
//                    }
//                    System.out.println(musicaNova.toString());
//                    navegar = br.readLine();
//                }
//                while (!navegar.equalsIgnoreCase("0"));
//                break;
//            case 2:
//                playlist.removerMusica(musicaCantor[0],musicaCantor[1]);
//                playlist.imprime();
//                break;
//            default:
//                break;
//        }

        }
    }
}
