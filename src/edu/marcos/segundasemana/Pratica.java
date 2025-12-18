package edu.marcos.segundasemana;
import java.util.Scanner;
import java.util.ArrayList;

public class Pratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> cesta = new ArrayList<>();
        System.out.println("Quantos objetos você quer colocar na cesta? ");
        int totalCompras = input.nextInt();
        input.nextLine();
        for (int n = totalCompras; n > 0; n--){
            System.out.println("Nome do objeto: ");
            String objeto = input.nextLine();
            cesta.add(objeto);
        }
        double preco = 0;
        for(String compras : cesta){
            System.out.println("Você comprou: "+ compras);
            preco += compras.length();
        }
        System.out.println("O preço total da compra ficou de \033[1;32m"+ preco+ "R$\033[m");
        System.out.println("Como deseja pagar? "+
                "\n  1 - \033[1;32mÁ VISTA\033[m"+
                "\n  2 - \033[1;33mPARCELADO\033[m"+
                "\nDigite sua opção: ");
        int opcao = input.nextInt();
        switch (opcao){
            case 1:{
                System.out.println("Como você escolheu pagar a vista terá 5% de desconto, o novo preço será: "+ (-preco * 0.05  +preco));
                break;
            }
            case 2:{
                    System.out.println("Quantas vezes deseja parcelar? ");
                    int quantidadeParcelas = input.nextInt();
                    input.nextLine();
                    if(quantidadeParcelas > 2){
                        preco = (preco * 0.05) + preco;
                        System.out.println("Como você parcelou "+ quantidadeParcelas +" vezes, o preço teve um aumento de 5%"+
                                "\nO novo preço será: \033[1;32m"+ preco+ "R$");
                    }
                    else
                        System.out.println("O preço final \033[1;32m"+ preco+ "R$");
                    break;
            }
            default:{
                System.out.println("\033[1;31mDIGITE UM VALOR VÁLIDO!");
                break;
            }
        }
}}
