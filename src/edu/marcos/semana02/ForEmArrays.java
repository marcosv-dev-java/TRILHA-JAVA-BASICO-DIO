package edu.marcos.semana02;

public class ForEmArrays {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        // em arrays o indice inicia em ZERO
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
        for (String aluno : alunos){
            /* essa é a estrutura de repetição for each, criamos uma variavel com o nome aluno
            esse ":" deve ser lido como "cada" exemplo: para cada aluno em alunos
            esse loop imprime cada aluno dentro da array alunos
             */
            System.out.println("Nome do aluno: " + aluno);
        }


    }
}
