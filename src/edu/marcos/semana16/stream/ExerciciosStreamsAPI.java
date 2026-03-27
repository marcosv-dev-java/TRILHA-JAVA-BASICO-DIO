package edu.marcos.semana16.stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ExerciciosStreamsAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
//        numerosAleatorios.forEach(s -> System.out.print(s + " -> "));
//        System.out.println("fim!");

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set; ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em um lista de números inteiros :");
        List<Integer> numerosAleatorioInt = new ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt) //Recebe uma função/metodo, pode ser uma classe utilitaria ou qualquer outro metodo.
                .toList());

        numerosAleatorioInt.forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> numerosPares = numerosAleatorioInt.stream()
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .toList();

        numerosPares.forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove os valores impares: ");
        numerosAleatorioInt.removeIf(integer -> integer % 2 != 0);

        System.out.println(numerosAleatorioInt);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println(numerosAleatorios);

        System.out.println("Retirando os números repetidos da lista, quantos números firam? ");
        Set<Integer> numerosAleatoriosSet = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        System.out.println("Antes eram: "+ numerosAleatorios.size() + " agora são: " + numerosAleatoriosSet.size());

        System.out.println("Mostre o menor valor da lista: " + Collections.min(numerosAleatorios.stream().map(Integer::parseInt).toList()));
        System.out.println("Mostre o maior valor da lista: " + Collections.max(numerosAleatorios.stream().map(Integer::parseInt).toList()));

        System.out.print("Pegue apenas os valores impares e some: ");

        int sum = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(integer -> integer % 2 != 0)
                .sum();

        System.out.println(sum);

        System.out.println("Mostre a lista na ordem númerica: "+numerosAleatorios.stream()
                .map(Integer::parseInt)
                .sorted()
        .toList());

        System.out.println("Agrupe os valores ímpares multíplos de 3 e de 5: ");
       Map<Boolean,List<Integer>> num =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(n -> n % 2 != 0 && n % 3 == 0 && n % 5 == 0));

        System.out.println(num);





    }
}
