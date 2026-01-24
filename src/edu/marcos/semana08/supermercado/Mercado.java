package edu.marcos.semana08.supermercado;

public class Mercado {
    public static void main(String[] args) {
        PilhaPao pilhaPao = new PilhaPao();

        TipoPao baguete = TipoPao.BAGUETE;
        TipoPao frances = TipoPao.FRANCES;
        TipoPao italiano = TipoPao.ITALIANO;

        Pao pao1 = new Pao();
        pao1.setTipoPao(baguete);

        Pao pao2 = new Pao();
        pao2.setTipoPao(frances);

        Pao pao3 = new Pao();
        pao3.setTipoPao(italiano);


        pilhaPao.novoPao(pao1);
        pilhaPao.novoPao(pao2);
        pilhaPao.novoPao(pao3);

        System.out.println(pilhaPao);

        pilhaPao.removerPao();

        System.out.println(pilhaPao);


    }
}
