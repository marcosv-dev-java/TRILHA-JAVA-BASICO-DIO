package edu.marcos.semana14.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<Carro> hashSetCarro = new HashSet<Carro>();


        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Volkswagen"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Honda"));
        hashSetCarro.add(new Carro("BYD"));

        System.out.println(hashSetCarro);

        Set<Carro> treeSetCarro = new TreeSet<Carro>();


        System.out.println(treeSetCarro);

        treeSetCarro.addAll(hashSetCarro);
        System.out.println(treeSetCarro);
        treeSetCarro.add(new Carro("BYD"));
        System.out.println(treeSetCarro);


    }

}
