package edu.marcos.semana15.collections.set.desafios.desafio01;

import java.util.Comparator;

public class ComparatorCor implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2); //Compara o objeto 1 com o objeto 2 considerando a ordem alfabética
    }
}
