package edu.marcos.semana15.collections.set.exemplos;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        Set<Double> linkedNotas = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        System.out.println(notas); // Perceba-se que a ordem é totalmente aleatória e também só aceitou somente um elemento 7

        System.out.println("Confira se a nota 5 está no conjunto: "+ (notas.contains(5d)? "Está no conjunto!": "Não está no conjunto!"));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));


        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator(); // notas.iterator retorna um iterator que é um objeto que percorre elemento por elemento
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);

        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();

        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        System.out.println(linkedNotas);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> treeNotas = new TreeSet<>(linkedNotas);
        System.out.println(treeNotas); // A estrutura TreeSet implementa o metodo comparable, que faz com que o objeto Double seja organizado de forma crescente


        System.out.println("Apague todo o conjunto");
        treeNotas.clear();
        linkedNotas.clear();
        notas.clear();
        System.out.println("Confira se está vazio: ");
        System.out.println(treeNotas.isEmpty());
        System.out.println(linkedNotas.isEmpty());
        System.out.println(notas.isEmpty());











    }
}
