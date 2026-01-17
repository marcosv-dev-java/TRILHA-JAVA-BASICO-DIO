package edu.marcos.semana07.jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Poder jogador1 = null;
        Poder jogador2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo");
        for(int i = 1; i <= 2; i++){
            // Criamos um objeto temporário para poder atribuir o valor do poder nos jogadores
            Poder escolhaPoder;
            System.out.println("Digite o poder do jogador " + i +":");
        while(true){
            System.out.print(
                    """
                            1- FOGO\
                            
                            2- RAIO\
                            
                            3- VOID\
                            
                            Digite sua escolha:\s""");
            int opcao = sc.nextInt();
            if(opcao == 1){
                escolhaPoder = Poder.FOGO;
                break;
            }
            if(opcao == 2){
                escolhaPoder = Poder.RAIO;
                break;
            }
            if(opcao == 3){
                escolhaPoder = Poder.VOID;
                break;
            }
            else System.out.println("\033[1;31mOPÇÃO INVÁLIDA\033[m");
        }
        // Se for a vez do jogador 1 escolher atribui para o jogador 1, se não, atribui para o jogador 2
        if (i == 1){
            jogador1 = escolhaPoder;
        }else jogador2 = escolhaPoder;
        }

        System.out.println("=== JOGO INICIADO ===");
        System.out.println("JOGADOR 1: " + jogador1.getTipoPoder());
        System.out.println("JOGADOR 2: " + jogador2.getTipoPoder());
        while(true){
            while(jogador1.getHp()> 0 && jogador2.getHp()> 0){
                for(int i = 1; i <= 2; i++){
                    Poder atacante = (i == 1) ? jogador1 : jogador2;
                    Poder defensor = (i == 1) ? jogador2 : jogador1;
                    if(atacante.getHp() <= 0 ||defensor.getHp() <= 0) break;
                    System.out.println("Turno do jogador "+ i);
                    System.out.println("""
                            1 - Atacar
                            2 - Ver HP Inimigo""");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    if (escolha == 1){
                        System.out.println("==========================");
                        System.out.println("Jogador "+ i + " atacou o jogador " + (i == 1 ? "2": "1") + " e causou " + atacante.getDano()+ " de Dano");
                        atacante.carregarUltimate();
                        if (atacante.podeUsarUltimate()){
                            atacante.executarUltimate(defensor);
                        }
                        defensor.receberDano(atacante.getDano());
                        System.out.println(defensor.toString());
                    }
                    else if  (escolha == 2) System.out.println("\033[1;32mHP: \033[m" + defensor.getHp());
                    System.out.println("==========================");

                }

            }
            if (jogador1.getHp() <= 0 || jogador2.getHp() <= 0) break;
        }
        System.out.println("=== JOGO FINALIZADO ===");
        System.out.println(jogador1.getHp() > 0 ? "Jogador 1 venceu" : "Jogador 2 venceu");


    }
}
