package edu.marcos.semana15.collections.set.ordenacao;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        /* Dada as seguinte informações sobre minhas séries favoritas,
        crie um conjunto e ordene este conjunto exibindo:
        (Nome- Genero - Tempo de epsisódio)
         */
        Set<Serie> hashSerie = new HashSet<>(){{
            add(new Serie("HunterXHunter", "Anime", 29));
            add(new Serie("Shingeki no Kyojin", "Anime", 24));
            add(new Serie("Villand Saga", "Anime", 27));

        }};

        System.out.println("\033[7;35m-- Ordem Aleatória --");
        System.out.print("\033[m");
        for (Serie serie : hashSerie) {
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+ serie.getGenero());
            System.out.println("Tempo de episódio: "+ serie.getTempoEpisodio());
            System.out.println("_____________________");
        }

        System.out.println("\033[7m-- Ordem de inserção --");
        System.out.print("\033[m");
        Set<Serie> linkedHashSerie = new LinkedHashSet<>(){{
            add(new Serie("HunterXHunter", "Anime", 29));
            add(new Serie("Shingeki no Kyojin", "Anime", 24));
            add(new Serie("Villand Saga", "Anime", 27));
        }};
        for(Serie serie: linkedHashSerie){
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+ serie.getGenero());
            System.out.println("Tempo de episódio: "+ serie.getTempoEpisodio());
            System.out.println("_____________________");
        }

        System.out.println("\033[7;37m-- Ordem Natural(Tempo de episodio) --");
        System.out.print("\033[m");
        Set<Serie> treeSerie = new TreeSet<>(linkedHashSerie);
        for(Serie serie: treeSerie){
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+ serie.getGenero());
            System.out.println("Tempo de episódio: "+ serie.getTempoEpisodio());
            System.out.println("_____________________");
        }

        System.out.println("\033[7;33m-- Ordem Nome/Genero/TempoEpisodio --");
        System.out.print("\033[m");
        Set<Serie> treeSetSerie = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        treeSetSerie.addAll(treeSerie);
        for(Serie serie: treeSetSerie){
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+ serie.getGenero());
            System.out.println("Tempo de episódio: "+ serie.getTempoEpisodio());
            System.out.println("_____________________");
        }










    }
}
