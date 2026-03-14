package edu.marcos.semana15.collections.set.desafios.desafio02;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    @Override
    public int compareTo(LinguagemFavorita outraLinguagem) {
        return this.nome.compareToIgnoreCase(outraLinguagem.nome);
    }

    private String nome;
    private String ide;
    private Integer anoDeCriacao;

    public LinguagemFavorita(String nome, String IDE, Integer anoDeCriacao) {
        this.nome = nome;
        this.ide = IDE;
        this.anoDeCriacao = anoDeCriacao;
    }

    public LinguagemFavorita() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", IDE='" + ide + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                '}';
    }
}
