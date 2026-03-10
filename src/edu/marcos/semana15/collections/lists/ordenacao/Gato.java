package edu.marcos.semana15.collections.lists.ordenacao;

public class Gato implements Comparable<Gato>{

    private String nome;
    private Integer meses;
    private String cor;

    public Gato() {
    }

    public Gato(String nome, int meses, String cor) {
        this.nome = nome;
        this.meses = meses;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", meses=" + meses +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
