package edu.marcos.semana13.queue;

import java.util.Objects;

public class Linguagem {
    private String nome;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return Objects.equals(nome, linguagem.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public Linguagem(String nome) {
        this.nome = nome;
    }

    public Linguagem() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
