package edu.marcos.semana10.Musica;

public class Musica {
    private String nome;
    private String nomeArtista;
    private String duracao;

    public Musica(String nome, String nomeArtista, String duracao) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.duracao = duracao;
    }


    public String getNome() {
        return nome;
    }



    public String getNomeArtista() {
        return nomeArtista;
    }


    public String getDuracao() {
        return duracao;
    }


}
