package edu.marcos.semana14.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();


        aluno.put("Nome", "Marcos");
        aluno.put("Idade", "17");
        aluno.put("Media", "7.5");
        aluno.put("Turma", "2B");

        System.out.println(aluno);
        System.out.println(aluno.values());
        System.out.println(aluno.keySet());

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);
        System.out.println(listaAlunos);







    }
}
