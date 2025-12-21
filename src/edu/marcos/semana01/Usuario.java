package edu.marcos.semana01;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A televisão tá ligada? " + smartTv.taLigada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);
        smartTv.ligar();
        System.out.println("Novo status - A televisão tá ligada? " + smartTv.taLigada);
        smartTv.desligar();
        System.out.println("Novo status - A televisão tá ligada? " + smartTv.taLigada);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+ smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: "+ smartTv.volume);
        smartTv.escolherCanal(10);
    }
}
