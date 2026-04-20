package edu.marcos.semana17.debugging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Progama iniciado no main");
        a();
        System.out.println("Progama finalizado no main!!");

    }
    static void a(){
        System.out.println("Entrou no método A!");
        b();
        System.out.println("Finalizou o método A!");

    }
    static void b(){
        System.out.println("Entrou no método B!");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Finalizou o método B!");
    }
    static void c(){
        System.out.println("Entrou no método C!");
        System.out.println("Finalizou o método C!");
    }

}
