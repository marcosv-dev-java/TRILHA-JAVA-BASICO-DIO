package edu.marcos.semana01;

public class Escopo {
    public void calcularArea (double base, double altura){
        double area = base*altura;
        System.out.println("Area: " + area);
    }
    public static void main(String[] args){
        Escopo e = new Escopo(); // CRIANDO UM OBJETO PARA USAR O METODO calcularArea
        e.calcularArea(10,20);
    }


}
