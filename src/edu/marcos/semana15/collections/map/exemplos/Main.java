package edu.marcos.semana15.collections.map.exemplos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos valores: ");
         Map<String, Double> carrosPopulares = new HashMap<>(){{
             put("Gol", 14.4);
             put("Uno", 15.6);
             put("Mobi", 16.1);
             put("Hb20", 14.5);
             put("Kwid", 15.6);
         }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o valor do consumo do gol por 15,2km/l");
        carrosPopulares.replace("Gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("Confira se o modelo tucson está no dicionário : "+ carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));

        System.out.println("Exiba os modelos: ");
        System.out.println(carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros: ");
        System.out.println(carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo");
        Double consumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> carroEconomico = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> elemento : carroEconomico){
            if(elemento.getValue().equals(consumo)){
                System.out.println(elemento);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        consumo = Collections.min(carrosPopulares.values());
        for (Map.Entry<String, Double> elemento : carroEconomico){
            if(elemento.getValue().equals(consumo)){
                System.out.println(elemento);
            }
        }

        System.out.print("Exiba a soma dos consumos: ");
        double soma = 0;
        for(Map.Entry<String, Double> elemento : carrosPopulares.entrySet()){
            soma += elemento.getValue();
        }
        System.out.println(soma);
        System.out.println("Exiba a média de consumos deste dicionário: " + soma/carrosPopulares.size() );

        System.out.println("Remova os modelos que o consumo é igual a 15.6km/L: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(15.6)){
                iterator.remove();
            }
        }

        System.out.println(carrosPopulares.keySet());


        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosEncadeados = new LinkedHashMap<>(){{
                put("Gol", 14.4);
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("Hb20", 14.5);
                put("Kwid", 15.6);
            }};
        System.out.println(carrosEncadeados.keySet());
        System.out.println(carrosEncadeados.values());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosOrdenados = new TreeMap<>(carrosEncadeados);
        System.out.println(carrosOrdenados.keySet());
        System.out.println(carrosOrdenados.values());

        System.out.println("Apague todo o conjunto de carro: ");
        carrosPopulares.clear();

        System.out.println("Verifique se o dicionário está vazio: " + carrosPopulares.isEmpty());











    }

}
