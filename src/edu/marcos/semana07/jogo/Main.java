package edu.marcos.semana07.jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Poder jogador1 = null;
        Poder jogador2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo");
        System.out.println("Digite o poder do jogador 1: ");
        while(true){
            System.out.print(
                    """
                            1- FOGO\
                            
                            2- RAIO\
                            
                            3- VOID\
                            
                            Digite sua escolha:\s""");
            int escolha = sc.nextInt();
            if(escolha == 1){
                jogador1 = Poder.FOGO;
                break;
            }
            if(escolha == 2){
                jogador1 = Poder.RAIO;
                break;
            }
            if(escolha == 3){
                jogador1 = Poder.VOID;
                break;
            }
            else System.out.println("\033[1;31mOPÇÃO INVÁLIDA\033[m");
        } System.out.println("Digite o poder do jogador 2: ");
        while(true){
            System.out.print(
                    """
                            1- FOGO\
                            
                            2- RAIO\
                            
                            3- VOID\
                            
                            Digite sua escolha:\s""");
            int escolha = sc.nextInt();
            if(escolha == 1){
                jogador2 = Poder.FOGO;
                break;
            }
            if(escolha == 2){
                jogador2 = Poder.RAIO;
                break;
            }
            if(escolha == 3){
                jogador2 = Poder.VOID;
                break;
            }
            else System.out.println("\033[1;31mOPÇÃO INVÁLIDA\033[m");
        }
        System.out.println("=== JOGO INICIADO ===");
        System.out.println("JOGADOR 1: " + jogador1.getTipoPoder());
        System.out.println("JOGADOR 2: " + jogador2.getTipoPoder());
        while(true){
            while(jogador1.getHp() != 0  || jogador2.getHp() != 0){


            }

        }





    }
}
