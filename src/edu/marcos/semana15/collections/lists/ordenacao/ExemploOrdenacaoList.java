package edu.marcos.semana15.collections.lists.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Rodolfo",20, "Marrom"));
            add(new Gato("Tito",12, "Preto"));
            add(new Gato("Lili",9, "Branco"));
            add(new Gato("Cisco",15, "Cinza"));
        }};

        System.out.println(gatos);
    }
}
