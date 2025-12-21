package edu.marcos.semana04.banco;

public enum TipoConta {
    CORRENTE(15.0, 1000, "Conta corrente"),
    POUPANCA(5.0, 500, "Conta poupança"),
    SALARIO(0.0, 300, "Conta salario"),;

    final private double taxa;
    final private int limite;
    final private String descricao;

    TipoConta(double taxa, int limite, String descricao){
        this.taxa = taxa;
        this.limite = limite;
        this.descricao = descricao;
    }
    public double getTaxa() {
        return taxa;
    }
    public int getLimite() {
        return limite;
    }

    public boolean podeSacar(double saque,double saldo){
        return saque <= saldo && saque <= limite;

    }

}
