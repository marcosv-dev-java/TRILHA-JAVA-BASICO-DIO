package edu.marcos.semana15.collections.map.exercicios.exercicio01;

import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Dada a população estimada de alguns estados do nordeste brasileiro, faça:
            Estado = PE - População = 9.616.621
            Estado = AL - População = 3.351.543
            Estado = CE - População = 9.187.103
            Estado = RN - População = 3.534.265
          Crie um dicionário e relacione os estados e as suas populações;
          Substitua a população do estado do RN por 3.534.165;
          Confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039.277;
          Exiba a população de PE
          Exiba todos os estados e as suas populações na ordem que foi informado
          Exiba os estados e as suas populações em ordem alfabética
          Exiba o estado com a menor população e a sua quantidade
          Exiba o estado com a maior população e a sua quantidade
          Exiba a média da população deste dicionário de estados
          Remova os estados com a população menor que 4.000.000
          Apague o dicionário e confira se está vazio
         */
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale ("pt", "BR"));

        Map<String, Integer> estados = new LinkedHashMap<>(){{
            put("PE",9_616_621);
            put("AL",3_351_543);
            put("CE",9_187_103);
            put("RN",3_534_265);
        }};
        MapFormatacao mapFormatado = new MapFormatacao();
        mapFormatado.exibirFormatado(estados);
        System.out.println("Substitua a população do estado do RN por 3.534.165");
        estados.replace("RN",3_534_165);
        System.out.println("Confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039.277");
        if (!estados.containsKey("PB")) {
            estados.put("PB", 4_039_277);
        }

        mapFormatado.exibirFormatado(estados);

        System.out.println("Exiba a população de PE: " + numberFormat.format(estados.get("PE")));

        System.out.println("Exiba todos os estados e população na ordem que foi informado: ");
        mapFormatado.exibirFormatado(estados);


        System.out.println("Exiba todos os estados e as suas populações na ordem que alfabética: ");
        Map<String,Integer> estadosArvore = new TreeMap<>(estados);
        mapFormatado.exibirFormatado(estadosArvore);

        System.out.println("Exiba o estado com a menor população e a sua quantidade: ");

        Integer menorPopulacao = Collections.min(estados.values());
        for (Map.Entry<String,Integer> entry : estadosArvore.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
                System.out.println(entry.getKey() + " = " + numberFormat.format(entry.getValue()));
            }
        }

        System.out.println("Exiba o estado com a maior população e a sua quantidade: ");
        Integer maiorPopulacao = Collections.max(estados.values());
        for (Map.Entry<String,Integer> entry : estadosArvore.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao)) {
                System.out.println(entry.getKey() + " = " + numberFormat.format(entry.getValue()));
            }
        }

        System.out.print("Exiba a média da população deste dicionário de estados: ");
        int soma = 0;
        for (Map.Entry<String,Integer> entry : estados.entrySet()) {
            soma += entry.getValue();
        }
        int media = soma / estados.size();
        System.out.println(numberFormat.format(media));

        System.out.println("Remova os estados com a população menor que 4.000.000");
        Iterator<Map.Entry<String,Integer>> iterator = estados.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if(entry.getValue() < 4_000_000){
                iterator.remove();
            }
        }

        mapFormatado.exibirFormatado(estados);


        estados.clear();
        System.out.println("Apague o dicionário e verifique se está vazio: " + estados.isEmpty());




    }
}
