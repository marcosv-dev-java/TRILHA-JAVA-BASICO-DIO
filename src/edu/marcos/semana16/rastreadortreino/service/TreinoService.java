package edu.marcos.semana16.rastreadortreino.service;

import edu.marcos.semana16.rastreadortreino.model.ChaveSessao;
import edu.marcos.semana16.rastreadortreino.model.SessaoTreino;
import edu.marcos.semana16.rastreadortreino.repository.TreinoRepository;

import java.util.List;

public class TreinoService {
    TreinoRepository treinoRepository;

    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public double calcularProgesso(ChaveSessao anterior,ChaveSessao atual ) {
        double porcentagem;
        SessaoTreino sessaoAnterior = this.treinoRepository.buscarSessao(anterior);
        SessaoTreino sessaoAtual = this.treinoRepository.buscarSessao(atual);

        double volumeAnterior = sessaoAnterior.getSeriesExercicio().values().stream()
                .flatMap(List::stream)
                .mapToDouble(s -> s.carga() * s.repeticoes()).sum();

        double volumeAtual = sessaoAtual.getSeriesExercicio().values().stream()
                .flatMap(List::stream)
                .mapToDouble(s -> s.carga() * s.repeticoes()).sum();

        porcentagem = (volumeAtual - volumeAnterior) / volumeAnterior * 100;

        return porcentagem;

    }

    public void salvarTreino(ChaveSessao chaveSessao, SessaoTreino sessaoTreino) {
        if (chaveSessao.semana() < this.treinoRepository.getUltimaSemana()){
            throw new IllegalArgumentException("Não é possivel adicionar uma semana anterior a ultima registrada!");
        }
       treinoRepository.salvarTreino(chaveSessao, sessaoTreino);

    }
    //TODO fazer método para salvar dia de treino, filtrar por semana/grupo muscular etc.

}
