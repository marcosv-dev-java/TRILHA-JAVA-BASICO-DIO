package edu.marcos.semana06;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        // O valor intA atribui o intB não necessariamente faz uma ligação
       System.out.println("IntA = "+ intA + " intB = "+ intB);
        intA = 2;
        // Percebe que se fizer uma alterção na variavel intA não muda na intB
        System.out.println("IntA = "+ intA + " intB = "+ intB);


        MeuObjeto objetoA = new MeuObjeto(1);// Criamos um objeto a que tem o valor de 1
        MeuObjeto objetoB = objetoA; // Objeto B é igual ao Objeto A


        System.out.println("objetoA = "+ objetoA + " objetoB = "+ objetoB);
        objetoA.setNum(2); // Setei o Objeto A para o valor 2

        System.out.println("objetoA = "+ objetoA + " objetoB = "+ objetoB); // Percebe-se que diferente da varíavel, alterou o valor dos 2

    }
}
