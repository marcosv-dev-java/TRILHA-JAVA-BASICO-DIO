package edu.marcos.semana12.equalshash;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Volkswagen"));
        Moto moto = new Moto("Ford");

        System.out.println(listaCarro.get(0).equals(moto));
        System.out.println(new Carro("Ford").hashCode());

    }
}
