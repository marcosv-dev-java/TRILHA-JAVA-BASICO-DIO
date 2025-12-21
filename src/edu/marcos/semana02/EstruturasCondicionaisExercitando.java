package edu.marcos.semana02;
import java.util.Scanner;

public class EstruturasCondicionaisExercitando {
    public static void main(String[] args){
        // PROGAMA QUE O USUARIO DIGITA UM NUMERO E FALA UM DIA DA SEMANA CORRESPONDENTE
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1  a 7 para falar o dia correspondente da semana: ");
        int numeroDaSemana = input.nextInt();
        switch(numeroDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("\033[1;31mDigite um número entre 1 a 7!");

        }
    }
}
