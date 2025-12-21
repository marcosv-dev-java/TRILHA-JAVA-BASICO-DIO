package edu.marcos.semana04;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner input = new Scanner(System.in);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());

    }
}
