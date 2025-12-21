package edu.marcos.semana02;
import java.util.Scanner;
public class Vogal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma única letra para descobrir se é vogal ou não: ");
        char letra = input.next().charAt(0);
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante!");

        }
    }

}
