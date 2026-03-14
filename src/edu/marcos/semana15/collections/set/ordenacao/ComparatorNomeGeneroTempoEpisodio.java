package edu.marcos.semana15.collections.set.ordenacao;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome =  serie1.getNome().compareToIgnoreCase(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
        if (genero != 0) return genero;

        return serie1.getTempoEpisodio().compareTo(serie2.getTempoEpisodio());
    }
}
