package edu.marcos.segundasemana;
import java.util.concurrent.ThreadLocalRandom;

public class JoaozinhoNoMercado {
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }

    public static void main(String[] args) {
        double mesada = 50;
        System.out.println("Joãozinho foi ao mercado para gastar sua mesada de "+ mesada + "R$");
        System.out.println("  ===== MERCADO DOCINHO =====  ");
        int contador = 0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce de valor \033[1;32m"+ valorDoce+ "R$\033[m adicionado no carrinho..");
            mesada -= valorDoce;
            contador++;
        }
        System.out.println("Joãozinho ficou com a mesada de \033[1;32m"+ mesada+ "R$\033[m, e comprou no total de "+ contador+ " doces!");
    }
}
