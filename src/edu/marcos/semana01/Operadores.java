package edu.marcos.semana01;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5; // DECLARAÇÃO DE VARIAVEL
        System.out.println("\033[1;35m===PRATICANDO OPERADOR UNITARIOS===\033[m");
        System.out.println(numero);
        numero = -numero; // TRANSFORMA O NUMERO POSITIVO EM NEGATIVO
        System.out.println(numero);
        numero = + numero; // ERA PRA SOMAR O NUMERO MAS NAO DA CERTO NESSE CASO, NAO SEI EXPLICAR NAO
        System.out.println(numero);
        numero = numero * -1; // TRANSFORMA O NUMERO NEGATIVO EM POSITIVO
        System.out.println(numero);


        System.out.println("\033[1;35m===PRATICANDO INCREMENTO===\033[m");// PEGAR UM VALOR E APLICAR UMA NOVA ATRIBUIÇÃO
        // DECREMENTAR JÁ É O OPOSTO PEGA O VALOR E REMOVE UMA QUANTIDADE SEILA ALGO ASSIM

        numero = 10;
        System.out.println(--numero);
        System.out.println("\033[1;35m===PRATICANDO BOOLEAN===\033[m");// É UMA VARIAVEL QUE APRESENTA UM VALOR VERDADEIRO OU FALSO
        boolean isHetero = false;
        if (isHetero)
            System.out.println("O caba é macho!");
        else
            System.out.println("O caba é baitola!");
        isHetero = !isHetero;
        System.out.println(isHetero);



        System.out.println("\033[1;35m===PRATICANDO TENARIO===\033[m"); // É UM IF E ELSE SÓ QUE ESCRITO EM UMA LINHA
        int a,b;
        a = 100;
        b = 20;
        String resultado = a <b ? "A é menor que B": "B é menor que A";
        System.out.println(resultado);



        System.out.println("\033[1;35m===PRATICANDO OPERADORES LOGICOS\033[m");// E COMO SE FOSSE UM AND E OR NO PYTHON

        char sexo = 'M';
        byte idade =  19;
        int ano =  2025;

        if (sexo == 'M'){
            if (idade < 18){
                System.out.println("Nao precisa se preocupar ainda");
            }
            else{
                System.out.println("Ta na hora de se alistar ja");
            }
        }
        else if (sexo == 'F'){
            System.out.println("Nem precisa se alistar, voce e muie");
            if (idade < 18){
                System.out.println("Sem contar que e menor de idade!");
            }
        }
        System.out.println("E voce nasceu no ano: " +( ano - idade));
    }

}
