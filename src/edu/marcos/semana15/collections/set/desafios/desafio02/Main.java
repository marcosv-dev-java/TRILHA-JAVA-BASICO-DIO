package edu.marcos.semana15.collections.set.desafios.desafio02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /* Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide.
        Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        A. Ordem de inserção.
        B. Ordem Natural(Nome)
        C. IDE
        D. Ano de criação e Nome
        E. Nome, Ano de criação e IDE
        Ao final, exiba as linguagens no console um abaixo da outra
         */

        Set<LinguagemFavorita> linkedHashLinguagem = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java","InteliJ",1995));
            add(new LinguagemFavorita("Python","Pycharm",1991));
            add(new LinguagemFavorita("C#","Visual Studio",2002));
        }};

        System.out.println("-- Ordem de inserção --");
        System.out.println(linkedHashLinguagem);

        System.out.println("-- Ordem Natural(Nome) --");
        Set<LinguagemFavorita> arvoreLinguagem = new TreeSet<>(linkedHashLinguagem);
        System.out.println(arvoreLinguagem);

        System.out.println("-- Ordenação pela Ide --");
        Set<LinguagemFavorita> arvoreIde = new TreeSet<>(new ComparatorIde());
        arvoreIde.addAll(linkedHashLinguagem);
        System.out.println(arvoreIde);

        System.out.println("-- Ordenação Ano de criação e Nome --");
        Set<LinguagemFavorita> arvoreAnoCriacaoNome = new TreeSet<>(new ComparatorAnoCriacaoNome());
        arvoreAnoCriacaoNome.addAll(linkedHashLinguagem);
        System.out.println(arvoreAnoCriacaoNome);

        System.out.println("-- Ordenação Nome, Ano de criação e IDE --");
        Set<LinguagemFavorita> arvoreNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        arvoreNomeAnoIde.addAll(linkedHashLinguagem);

        System.out.println(arvoreNomeAnoIde);
        System.out.println(arvoreIde);
        System.out.println(linkedHashLinguagem);
        System.out.println(arvoreAnoCriacaoNome);
        System.out.println(arvoreLinguagem);





    }
}
