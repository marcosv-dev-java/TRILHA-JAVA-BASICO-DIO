package edu.marcos.segundasemana;
import  java.util.Scanner;


public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número para operação: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo número para operação: ");
        double num2 = input.nextDouble();
        System.out.println("Digite um caractere para operação: "+
                "\n+ Somar"+
                "\n- Subtrair"+
                "\n* Multiplicar"+
                "\n/ Dividir");
        String opcao = input.next();
        double resultado;
        switch (opcao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("\033[1;31mDIGITE UM CARACTERE VALIDO!\033[m");
                return;

        }

        System.out.println("O resultado da sua operação é "+ resultado);

}
}
