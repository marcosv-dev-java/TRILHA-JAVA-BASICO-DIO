package edu.marcos.semana15.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println("Indíce da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0); // Guarda o indíce da nota 5 e substitui pela 6
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no ArrayList: " + (notas.contains(5.0)? "\033[1;32mEstá na lista!\033[m": "\033[1;31mNão está na lista!\033[m"));

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for (Double nota : notas) System.out.print(nota + "-> ");
        System.out.println("null");

        System.out.println("Exiba a terceira nota na lista: " + notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        System.out.print("Exiba a soma dos valores: ");

        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.removeFirst();
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");



        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            double next = iterator2.next();
            if(next < 7){
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());



    }
}
