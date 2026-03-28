package edu.marcos.semana16.rastreadortreino.ui;


import edu.marcos.semana16.rastreadortreino.model.*;
import edu.marcos.semana16.rastreadortreino.repository.TreinoRepository;
import edu.marcos.semana16.rastreadortreino.service.MenuService;
import edu.marcos.semana16.rastreadortreino.service.TreinoService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final TreinoService service;
    private TreinoRepository repositorio;
    private final MenuService menu;
    private final Scanner sc;

    public Menu(TreinoService service, MenuService menu, Scanner sc, TreinoRepository repositorio) {
        this.service = service;
        this.menu = menu;
        this.sc = sc;
        this.repositorio = repositorio;
    }

    public void registrarSessao(GrupoMuscular grupo) throws InterruptedException{
        int series;
        int semana;
        double carga;
        int repeticoes;
        Serie serieAtual;
        ChaveSessao chaveAtual;
        SessaoTreino sessaoAtual;

        System.out.print("Semana: ");
        semana = sc.nextInt();
        chaveAtual = new ChaveSessao(semana, grupo);
         sessaoAtual = new SessaoTreino(grupo);
        for(Exercicio ex : Exercicio.values()) {
            if (ex.getGrupoMuscular().equals(grupo)) {
                menu.linhaFormatada(30, "Exercicio: "+ ex.getExercicio());
                System.out.println("Quantas series serão cadastradas? ");
                series = sc.nextInt();
                for (int i = 0; i < series; i++) {
                    menu.linhaFormatada(30, "Serie " + (i + 1) + ":");
                    menu.printAnimado("Carga :", 10);
                    carga = sc.nextDouble();
                    menu.printAnimado("Repetições :", 10);
                    repeticoes = sc.nextInt();
                    serieAtual = new Serie(repeticoes, carga);
                    sessaoAtual.adicionarSerie(ex, serieAtual);
                }
            }
        }
        service.salvarTreino(chaveAtual, sessaoAtual);
}

    private List<SessaoTreino> buscarSessao(int semana){

        return  repositorio.getDiaDeTreino().entrySet().stream()
                .filter(entry -> entry.getKey().semana() == semana)
                .map(Map.Entry::getValue)
                .toList();
    }


    private void exibirDetalhes(SessaoTreino sessao) {
        System.out.println("Grupo Muscular: " + sessao.getGrupoMuscular());
        sessao.getSeriesExercicio().forEach((exercicio, series) -> {
            System.out.println("  " + exercicio.getExercicio());
            series.forEach(serie ->
                    System.out.println("    " + serie.repeticoes() + " reps / " + serie.carga() + "kg")
            );
        });
    }

    public void exibirSessoes(int semana){
        buscarSessao(semana).forEach(this::exibirDetalhes);

    }
    public void exibirSessoes() {
        repositorio.getDiaDeTreino().forEach((key, value) -> {
            System.out.println("Semana: " + key.semana());
            exibirDetalhes(value);
        });
    }
}
