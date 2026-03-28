package edu.marcos.semana16.rastreadortreino.ui;

import edu.marcos.semana16.rastreadortreino.model.*;
import edu.marcos.semana16.rastreadortreino.repository.TreinoRepository;
import edu.marcos.semana16.rastreadortreino.service.MenuService;
import edu.marcos.semana16.rastreadortreino.service.TreinoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TreinoRepository repositorio = new TreinoRepository();
        TreinoService service = new TreinoService(repositorio);
        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();
        Menu menu = new Menu(service,menuService, sc, repositorio);
        // Variaveis, declarei aqui para evitar de dentro do loop rodar int opcao ou int semana varias vezes.
        int opcao;
        menuService.linhaFormatada(60, Color.BLUE.getBold() + "BEM VINDO AO REGISTRO DE ACADEMIA" + Color.RESET);
        while (true){
            menuService.printAnimado("O que deseja fazer hoje?", 200);
            System.out.print("""
                    [ 1 ] - Adicionar novo treino
                    [ 2 ] - Buscar sessão de treino
                    [ 3 ] - Comparar progresso
                    [ 4 ] - Sair
                    Digite sua opção:""");
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Qual o grupo muscular deseja cadastrar? ");
                System.out.println("""
                        [ 1 ] - Peito
                        [ 2 ] - Costas
                        [ 3 ] - Perna""");
                opcao = sc.nextInt();
                if (opcao == 1) menu.registrarSessao(GrupoMuscular.PEITO);
                else if (opcao == 2 ) menu.registrarSessao(GrupoMuscular.COSTAS);
                else if (opcao == 3) menu.registrarSessao(GrupoMuscular.PERNA);
                else System.out.println(Color.RED.getBold() + "DIGITE UMA OPÇÃO VÁLIDA!" + Color.RESET);
            }
            else if (opcao == 2){
                Character resposta;
                do {
                    System.out.print("Deseja filtrar por semana [S/N] ");
                    resposta = sc.next().toUpperCase().charAt(0);
                } while (!resposta.equals('S') && !resposta.equals('N'));
                if (resposta.equals('S')) {
                    System.out.print("Qual semana deseja filtrar: ");
                    int semana = sc.nextInt();
                    menu.exibirSessoes(semana);
                }else menu.exibirSessoes();


            }
            else if (opcao == 3){
                System.out.println("Qual grupo muscular? ");
                System.out.println("""
                        [ 1 ] - Peito
                        [ 2 ] - Costas
                        [ 3 ] - Perna""");
                opcao = sc.nextInt();
                GrupoMuscular grupoAtual = null;
                switch (opcao) {
                    case 1: grupoAtual = GrupoMuscular.PEITO; break;
                    case 2: grupoAtual = GrupoMuscular.COSTAS; break;
                    case 3: grupoAtual = GrupoMuscular.PERNA; break;
                    default:
                        System.out.println(Color.RED.getBold() + ("DIGITE UMA OPÇÃO VÁLIDA!" + Color.RESET));
                        continue;
                }
                System.out.print("Qual semana deseja usar para comparar(atual)? ");
                int semanaAtual = sc.nextInt();
                System.out.print("Qual semana deseja ser comparada(anterior)? ");
                int semanaAnterior = sc.nextInt();
                ChaveSessao chaveAnterior = new ChaveSessao(semanaAnterior, grupoAtual);
                ChaveSessao chaveAtual = new ChaveSessao(semanaAtual, grupoAtual);
                double progresso = service.calcularProgesso(chaveAnterior, chaveAtual);
                System.out.println("A semana " + semanaAtual);
                System.out.println("Comparado com a semana " + semanaAnterior);

                System.out.printf("Teve um " + (progresso > 0 ? Color.GREEN.getBold() + "progresso de "
                        : Color.RED.getBold() + "regresso de ") + "%.2f%%" + Color.RESET + "\n", progresso);



            }
            else if(opcao == 4){
                break;
            }


        }

    }
}
