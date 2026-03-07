package edu.marcos.semana13.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Linguagem> queue = new LinkedList<Linguagem>();

        queue.add(new Linguagem("Java"));
        queue.add(new Linguagem("Python"));
        queue.add(new Linguagem("Rust"));
        queue.add(new Linguagem("C"));
        queue.add(new Linguagem("C#"));
        queue.add(new Linguagem("JavaScript"));

        System.out.println(queue);
        queue.remove();
        System.out.println(queue);


        queue.offer(new Linguagem("PHP"));
    }
}
