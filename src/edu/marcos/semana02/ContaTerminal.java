package edu.marcos.semana02;
import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("\033[1;34m=== BEM VINDO AO BANCO TERMINAL ===\033[m");
        System.out.println(" Digite o número da sua conta: ");
        int numeroConta = input.nextInt();

        System.out.println(" Digite a agência da sua conta: ");
        String agenciaConta = input.next();

        System.out.println(" Digite o seu nome cadastrado: ");
        String nomeCliente = input.next();

        System.out.println(" Digite seu saldo bancário: ");
        double saldo = input.nextDouble();


        System.out.println(" Processando informações...");

        System.out.println(" ACESSANDO CONTA DE " + nomeCliente);
        System.out.println(" Conta: " + numeroConta);
        System.out.println(" Agência: " + agenciaConta);
        System.out.println(" Saldo: \033[1;32m R$" + saldo+"\033[m");


    }
}
