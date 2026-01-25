package edu.marcos.semana08.supermercado;

public abstract class Pao {
    private TipoPao tipo;


    public Pao(TipoPao tipo){
        this.tipo = tipo;
    }
    public TipoPao getTipoPao(){
        return tipo;
    }
    public double getValor(){
        return tipo.getValor();
    }

}
