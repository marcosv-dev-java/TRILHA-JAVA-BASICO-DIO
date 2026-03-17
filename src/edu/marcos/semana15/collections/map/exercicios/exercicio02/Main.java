package edu.marcos.semana15.collections.map.exercicios.exercicio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> dado = new HashMap<Integer, Integer>(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};
        for (int i = 0; i < 100; i++) {
            int face = random.nextInt(6) + 1;

            dado.put(face, dado.get(face) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : dado.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
