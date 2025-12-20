package edu.marcos.terceirasemana.escola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(sc.next());
        System.out.println("Digite a nota do aluno: ");
        aluno.setNota(sc.nextDouble());
        System.out.println("ALUNO : "+ aluno.getNome());
        System.out.println("NOTA: "+ aluno.getNota());
        System.out.print("Situação : ");
        System.out.println(aluno.situacao());
    }
}
