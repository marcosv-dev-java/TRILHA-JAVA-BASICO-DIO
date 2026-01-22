package edu.marcos.semana08.lista;


public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> listaString = new ListaEncadeada<>();
        listaString.add("Pedro");
        listaString.add("Marcos");
        listaString.add("Lucas");
        listaString.add("Isaque");
        System.out.println(listaString.size());
        listaString.remove(0);
        System.out.println(listaString.toString());
    }
}
