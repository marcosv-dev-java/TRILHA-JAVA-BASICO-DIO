package edu.marcos.semana06.no;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");

        No no2 = new No("Conteudo no2");

        no1.setProximoNo(no2);

        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);
        // Nó 1 - > Nó 2 - > Nó 3 - > Nó 4 - > null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("____________________");

        System.out.println(no1); // Imprime o nó 1
        System.out.println(no1.getProximoNo()); // Imprime o proximo nó
        System.out.println(no1.getProximoNo().getProximoNo()); // Imprime o proximo do proximo nó
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // mesma regra
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // o ultimo nó sempre aponta pra null


    }
}
