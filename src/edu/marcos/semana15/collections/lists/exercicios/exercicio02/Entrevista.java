package edu.marcos.semana15.collections.lists.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Entrevista {

    public void inputFormatado(List<Character> lista){
        Scanner sc = new Scanner(System.in);
        char resposta;
        resposta = sc.nextLine().toLowerCase().charAt(0);
        if(resposta == 's' || resposta == 'n') {
            lista.add(resposta);
        }
        else{
            throw new InputMismatchException("Caractere inválido! Digite somente [Sim/Não]");
        }
    }

    public String resultadoRespostas(List<Character> lista){
        String resposta = "Não definido";
        int contador = 0;
        for (Character caractere : lista){
            if (caractere.equals('s')){
                contador++;
            }
        }
        if (contador == 2) resposta = "\033[1;34mSuspeita\033[m";
        else if (contador == 3 || contador == 4) {
            resposta = "\033[1;33mCúmplice\033[m";
        }
        else if (contador == 5) {
            resposta = "\033[1;31mAssasina\033[m";
        }
        else {
            resposta = "\033[1;32mInocente\033[m";
        }

        return resposta;
        }


    }



