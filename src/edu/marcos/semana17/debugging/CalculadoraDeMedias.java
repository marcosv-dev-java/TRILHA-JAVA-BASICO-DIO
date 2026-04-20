package edu.marcos.semana17.debugging;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Pelézinho","Ronaldo","Felipe","Marcao Gostosão"};
        double media = calcularMediaDaTurma(alunos,sc);
        System.out.printf("Média da turma %.2f", media);


    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner scan){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ",aluno);
            soma += scan.nextDouble();

        }
        return  soma /alunos.length;

    }

}
