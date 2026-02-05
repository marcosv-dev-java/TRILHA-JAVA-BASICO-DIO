package edu.marcos.semana10.Musica;
import java.util.Scanner;

public class Soundcloud implements PlataformaMusica{
    private final String titulo = "SoundCloud";

    private ListaDuplamenteEncadeada<Musica> lista;

    public Soundcloud(ListaDuplamenteEncadeada<Musica> lista) {
        this.lista = lista;
    }

    public void tocarMusica() {

    }


    public void menuPlataforma(boolean listarMusica) {
        int larguraTotal = 40;
        int larguraTexto = titulo.length();
        int espacosPelaMetade = (larguraTotal - larguraTexto) / 2;

        System.out.println("\033[7m");
        System.out.println("=".repeat(larguraTotal));
        System.out.print(" ".repeat(espacosPelaMetade));
        System.out.println(titulo);
        System.out.println("=".repeat(larguraTotal));

        System.out.println("\033[m");
        System.out.println("Musicas disponiveis: " + lista.size());
        if (listarMusica){
            System.out.println(lista.toString());
        }


    }
    public void adicionarMusica() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da musica: ");
        String nome = sc.nextLine();
        System.out.print("Nome do artista: ");
        String nomeArtista = sc.nextLine();
        System.out.print("Duração: ");
        String duracao = sc.nextLine();

        Musica musicaNova = new Musica(nome, nomeArtista,duracao);

        lista.add(musicaNova);
        System.out.println("Musica adicionada com sucesso!");
    }


    public void removerMusica(int index){
        lista.remove(index);
    }


    public Musica getMusica(int index) {
        return lista.get(index);
    }





}
