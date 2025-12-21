package edu.marcos.semana04.banco;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Bem vindo ao banco >> \033[1;31mJava\033[1;32mMoney\033[m <<");
            System.out.println("Digite o nome do titular: ");
            String titular = input.nextLine();
            System.out.println("Digite seu saldo inicial: ");
            double saldo = input.nextDouble();
            input.nextLine();
            System.out.println("Tipo de conta: " +
                    "\n1 - Corrente" +
                    "\n2 - Poupança" +
                    "\n3 - Salario");
            int opcao;
            while (true) {
                System.out.println("________________________");
                System.out.print("   Digite sua opção: ");
                opcao = input.nextInt();
                input.nextLine();
                System.out.println("________________________");
                if (opcao > 3 || opcao < 1) System.out.println("\033[1;31mDigite uma opção válida!\033[m");
                else break;
            }
            TipoConta tipoConta = null;
            switch(opcao){
                case 1: tipoConta = TipoConta.CORRENTE;
                break;
                case 2: tipoConta = TipoConta.POUPANCA;

                break;
                case 3: tipoConta = TipoConta.SALARIO;
                break;
            }
            System.out.println("Informações sobre sua conta: ");
            System.out.println("========================================");
            System.out.println("Limite: "+tipoConta.getLimite());
            System.out.println("Taxa: "+tipoConta.getTaxa());
            ContaBancaria conta = new ContaBancaria(titular, saldo, tipoConta);
            conta.mostrarDados();
            System.out.println("========================================");
            String depositar = "";
            while(!depositar.equalsIgnoreCase("S")  && !depositar.equalsIgnoreCase("N")){
                System.out.println("Deseja depositar? [S/N]: ");
                depositar = input.nextLine().trim().toLowerCase();
            }
            if(depositar.equalsIgnoreCase("S")){
                System.out.println("Quanto deseja depositar? ");
                double valor = input.nextDouble();
                conta.depositar(valor);
            }else System.out.println("Ok continuando progama!");

            String sacar = "";
            while(!sacar.equalsIgnoreCase("S")  && !sacar.equalsIgnoreCase("N")){
                System.out.println("Deseja sacar? [S/N]: ");
                sacar = input.nextLine().trim().toUpperCase();
            }
            if(sacar.equalsIgnoreCase("S")){
                System.out.println("Quanto deseja sacar? ");
                double valor = input.nextDouble();
                conta.sacar(valor);
            }else System.out.println("Ok continuando progama!");
            input.close();
        }
        catch (InputMismatchException e){
            System.out.println("\033[1;31mERROR InputMismatchException: DIGITE UM NUMERO INTEIRO!");

        }
        finally{
            System.out.println("======  FIM DO PROGAMA  ======");
        }
    }
}
