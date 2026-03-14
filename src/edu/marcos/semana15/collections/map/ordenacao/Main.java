package edu.marcos.semana15.collections.map.ordenacao;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\033[7;33m--\tOrdem Aleatória\t--");
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.print("\033[m");

        System.out.println("\033[7m--\tOrdem de Inserção\t--");
        LinkedHashMap<String, Livro> livrosLinked = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> entry : livrosLinked.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.print("\033[m");

        System.out.println("\033[7;31m--\tOrdem alfabética autores\t--");
        Map<String, Livro> livrosAlfabetica = new TreeMap<>(livrosLinked);
        for (Map.Entry<String, Livro> entry : livrosAlfabetica.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.print("\033[m");

        System.out.println("\033[7;32m--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> livrosSet = new TreeSet<>(new ComparatorNome());
        livrosSet.addAll(livrosAlfabetica.entrySet());

        for (Map.Entry<String, Livro> entry : livrosSet) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.print("\033[m");
        System.out.println("\033[7;35m--\tOrdem numero de paginas\t--");
        Set<Map.Entry<String, Livro>> livrosNumeroPaginas = new TreeSet<>(new ComparatorNumeroPaginas());
        livrosNumeroPaginas.addAll(livrosSet);
        for (Map.Entry<String, Livro> entry : livrosNumeroPaginas) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
            System.out.println("Paginas - " + entry.getValue().getPaginas());
        }
        System.out.print("\033[m");





    }
}
