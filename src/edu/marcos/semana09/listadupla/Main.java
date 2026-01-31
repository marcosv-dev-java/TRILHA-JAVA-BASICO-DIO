package edu.marcos.semana09.listadupla;



public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        System.out.println(lista);
    }
}
