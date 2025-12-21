package edu.marcos.semana02;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Sacando " + valorSolicitado + "R$");
        }
            System.out.println("Saldo: "+saldo+ "R$");

    }
}
