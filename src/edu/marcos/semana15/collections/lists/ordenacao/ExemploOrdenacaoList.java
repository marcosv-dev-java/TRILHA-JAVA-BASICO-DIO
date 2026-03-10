package edu.marcos.semana15.collections.lists.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Rodolfo", 20, "Marrom"));
            add(new Gato("Tito", 12, "Preto"));
            add(new Gato("Lili", 9, "Branco"));
            add(new Gato("Cisco", 15, "Cinza"));
            add(new Gato("Zap", 3, "Cinza"));
        }};

        System.out.println("-- Ordem de Inserção --");
        System.out.println(gatos);

        System.out.println("-- Ordem Aleatória --");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("-- Ordem Natural (Nome) --");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("-- Ordem Idade --");
        //Collections.sort(gatos, new ComparatorIdade())
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

    }
}
