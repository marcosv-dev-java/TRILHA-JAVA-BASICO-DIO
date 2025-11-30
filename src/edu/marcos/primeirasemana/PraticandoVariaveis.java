package edu.marcos.primeirasemana;

public class PraticandoVariaveis {
    public static void main(String[] args) {
        byte idade = 16;
        String nome = "Marcos;";
        if (idade <18){
            System.out.println("\033[1;32mVocê é menor de idade");}
            else if (idade > 18){
                System.out.println("\033[1;33mVocê é maior de idade");}
            else{
                System.out.println("\033[1m31;Digite algum valor válido");

        }

            System.out.print("\033[mSeu nome é: "+ nome + "\nSua idade é: " + idade);
            float nota1f = 9.44f;
            float nota2f = 3.11f;
            System.out.print("\nSua primeira nota é "+ nota1f + " e sua segunda nota é "+ nota2f + "\nA soma das duas notas é igual a: "+ nota1f + nota2f );
    }

}
