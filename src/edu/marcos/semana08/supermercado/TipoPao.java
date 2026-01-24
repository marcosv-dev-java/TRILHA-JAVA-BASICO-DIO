package edu.marcos.semana08.supermercado;

public enum TipoPao {
    FRANCES("Francês"),
    BAGUETE("Baguete"),
    ITALIANO("Italiano");

    private String tipoPao;


    TipoPao(String tipo) {
    }

    public String getTipoPao() {
        return tipoPao;
    }
}
