package edu.marcos.semana15.collections.set.desafios.desafio02;

import java.util.Comparator;

public class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoCriacao = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
