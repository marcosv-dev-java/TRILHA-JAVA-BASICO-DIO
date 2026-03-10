package edu.marcos.semana15.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        List<Double> notas = new LinkedList<>();
        //Adicionando as notas do aluno
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        // Se fosse adicionar todos os dados da ArrayList, usariamos a função notas.addall()

        //Mostrar a primeira nota da nova lista sem removê-lo:
        System.out.println(notas.getFirst());

        //Mostrar a primeira nota da nova lista removendo a nota:
        System.out.println(notas.removeFirst());
        System.out.println(notas);



    }
}
