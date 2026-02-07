package edu.marcos.semana10.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();


        listaCircular.add("Marcos");

        System.out.println(listaCircular);
        listaCircular.remove(0);
        System.out.println(listaCircular);







    }
}
