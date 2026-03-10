package edu.marcos.semana15.collections.lists.ordenacao;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getMeses(), gato2.getMeses());
    }

}
