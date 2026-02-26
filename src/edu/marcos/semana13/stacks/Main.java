package edu.marcos.semana13.stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<Carro> stack = new Stack<>();

        stack.push(new Carro("Ford"));
        stack.push(new Carro("Fiat"));
        stack.push(new Carro("BMW"));
        stack.push(new Carro("Chevrolet"));

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


    }
}
