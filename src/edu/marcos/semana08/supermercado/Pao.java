package edu.marcos.semana08.supermercado;

public class Pao {
    private TipoPao tipoPao;
    private Pao proximoPao = null;

    public TipoPao getTipoPao() {
        return tipoPao;
    }

    public Pao() {
    }

    public void setTipoPao(TipoPao tipoPao) {
        this.tipoPao = tipoPao;
    }

    public Pao getProximoPao() {
        return proximoPao;
    }

    public void setProximoPao(Pao proximoPao) {
        this.proximoPao = proximoPao;
    }

    @Override
    public String toString() {
        return "[Pao{" +
                "TipoPao=" + tipoPao +
                '}';
    }
}
