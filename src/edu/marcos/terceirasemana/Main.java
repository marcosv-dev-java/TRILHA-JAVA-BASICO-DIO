package edu.marcos.terceirasemana;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria ContaBancaria = new ContaBancaria();
        System.out.println("Qual o nome do titular bancário?");
        ContaBancaria.titular = sc.nextLine();
        System.out.println("Quanto de saldo tem na conta bancária?");

        ContaBancaria.saldo = sc.nextDouble();
        ContaBancaria.mostrarSaldo();
    }
}
