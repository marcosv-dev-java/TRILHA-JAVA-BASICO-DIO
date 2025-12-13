package edu.marcos.segundasemana;
import java.util.Scanner;

public class PraticandoFor {

    private static void imprimirContagem(int comeco, int fim){
        for(int num = comeco; fim > num; num++) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o começo da contagem: ");
        int comeco = input.nextInt();
        System.out.println("Digite o fim da contagem: ");
        int fim = input.nextInt();
        imprimirContagem(comeco, fim);


    }

}
