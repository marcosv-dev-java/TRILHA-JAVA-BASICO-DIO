package edu.marcos.semana02;
import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua opção: " +
                "\n1- Iniciar jogo"+
                "\n2- Carregar jogo"+
                "\n3- Sair");
        byte opcao = input.nextByte();
        switch(opcao){
            case 1:
                System.out.println("Iniciando o jogo..");
               break;
            case 2:
                System.out.println("Carregando o jogo..");
                break;
            case 3:
                System.out.println("Saindo do jogo..");
                break;
            default:
                System.out.println("\033[1;31m DIGITE UMA OPÇÃO VÁLIDA!");
        }



    }
}
