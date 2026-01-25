package edu.marcos.semana08.supermercado;

public enum TipoPao {
    FRANCES("Francês", 1),
    BAGUETE("Baguete",15),
    ITALIANO("Italiano",11);

    private String tipoPao;
    private double VALOR;


    TipoPao(String tipo, double VALOR) {
        this.tipoPao = tipo;
        this.VALOR = VALOR;
    }

    public String getTipoPao() {
        return this.tipoPao;
    }
    public double getValor() {
        return this.VALOR;
    }

}
