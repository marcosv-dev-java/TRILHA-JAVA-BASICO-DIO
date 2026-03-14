package edu.marcos.semana15.collections.set.desafios.desafio01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Crie um conjunto contendo as cores de um arco-iris e:
        A: Exiba todas as cores uma abaixo da outra
        B: A quantidade de cores que o arco-íris tem
        C: Exiba as cores em ordem alfabética
        D: Exiba as cores na ordem inversa da que foi informada
        E: Exiba todas as cores que começam com a letra "v"
        F: Remova todas as cores que não começam com a letra "v"
        G: Limpe o conjunto
        H: Confira se o conjunto está vazio
         */

        Set<String> coresArcoIris = new LinkedHashSet<String>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Azul Escuro");
            add("Violeta");
        }};
        for(String cor: coresArcoIris){
            System.out.println("Cor: " + cor);
        }

        System.out.println("Um arco-íris contém "+coresArcoIris.size() + " cores!");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresOrdenadosAlfabeticamente = new TreeSet<>(new ComparatorCor());
        coresOrdenadosAlfabeticamente.addAll(coresArcoIris);
        for(String cor: coresOrdenadosAlfabeticamente){
            System.out.println("Cor: " + cor);
        }

        System.out.println("Exiba as cores na ordem inversa que foi informado: ");

        ArrayList<String> arrayCores = new ArrayList<>(coresArcoIris);
        for(String cor: arrayCores.reversed()){
            System.out.println("Cor: " + cor);
        }

        System.out.println("Exiba todas as cores que começam com a letra V: ");
        for(String cor: coresArcoIris){
            if(cor.startsWith("V")){
                System.out.println("Cor: " + cor);
            }
        }

        System.out.println("Remova todas as cores que não começam com a letra v");
        coresArcoIris.removeIf(cor -> !cor.startsWith("V"));

        System.out.println("Limpe o conjunto ");
        coresArcoIris.clear();

        System.out.println("Confira se está vazio: "+ coresArcoIris.isEmpty());






    }
}
