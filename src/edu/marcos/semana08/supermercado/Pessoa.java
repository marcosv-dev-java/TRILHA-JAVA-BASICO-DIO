package edu.marcos.semana08.supermercado;


public class Pessoa {
    private String nome;
    private double dinheiro;
    private static int totalPessoasMercadado = 0;

    public Pessoa() {
        totalPessoasMercadado++;
    }

    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public static int getTotalPessoasMercadado() {
        return totalPessoasMercadado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }


    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
