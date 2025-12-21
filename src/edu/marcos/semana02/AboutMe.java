package edu.marcos.semana02;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args){
        // pelo que entendi scanner funciona como um input
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Seu nome é "+ nome + " "+ sobrenome);
        System.out.println("Sua idade é " + idade + " anos");
        System.out.println("Sua altura é "+ altura );
    }
}
