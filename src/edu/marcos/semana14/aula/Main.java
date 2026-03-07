package edu.marcos.semana14.aula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carList = new ArrayList<>();
        carList.add(new Carro("Fiat"));
        carList.add(new Carro("Chevrolet"));
        carList.add(new Carro("BYD"));
        Carro ford = new Carro("Ford");
        carList.add(ford);

        System.out.println(carList.contains(new Carro("Ford")));
        System.out.println(carList.get(2));
        System.out.println(carList.indexOf(ford));

        System.out.println(carList.remove(3));
        System.out.println(carList);




    }
}
