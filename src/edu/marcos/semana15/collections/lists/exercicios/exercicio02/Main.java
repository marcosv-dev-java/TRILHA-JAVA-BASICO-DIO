package edu.marcos.semana15.collections.lists.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Todo utilizando listas, faça um progama que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vitima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"

        Se a pessoa responder positivamente a 2 questão ela será classificada como "Suspeita"
        Se a pessoa responder positivamente a 3 ou 4 questão será classificada como "Cúmplice"
        Se for positivo para tudo será classificada como "Assasina"
        Se não for nenhuma das ocasiões, será classificada como "Inocente"
         */

        List<Character> lista = new ArrayList<>();
        Entrevista entrevista = new Entrevista();

        System.out.println("== Saudações, iremos questionar algumas perguntas e só aceitaremos respostas com Sim/Não ==");

        System.out.println("Telefonou para a vítima?");
        entrevista.inputFormatado(lista);

        System.out.println("Esteve no local do crime?");
        entrevista.inputFormatado(lista);

        System.out.println("Mora perto da vitima?");
        entrevista.inputFormatado(lista);

        System.out.println("Devia para a vítima?");
        entrevista.inputFormatado(lista);

        System.out.println("Já trabalhou com a vítima?");
        entrevista.inputFormatado(lista);

        System.out.print("De acordo com as suas respostas você foi declarado(a) como: ");
        System.out.println(entrevista.resultadoRespostas(lista));





    }
}
