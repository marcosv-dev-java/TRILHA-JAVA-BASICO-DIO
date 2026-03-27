package edu.marcos.semana16.rastreadortreino.service;

import edu.marcos.semana16.rastreadortreino.model.ChaveSessao;
import edu.marcos.semana16.rastreadortreino.model.GrupoMuscular;
import edu.marcos.semana16.rastreadortreino.model.SessaoTreino;
import edu.marcos.semana16.rastreadortreino.repository.TreinoRepository;

public class TreinoService {
    SessaoTreino sessaoAtual;

    public TreinoService(SessaoTreino sessaoAtual) {
        this.sessaoAtual = sessaoAtual;
    }

    public int calcularProgesso(TreinoRepository historico, int semana, GrupoMuscular grupoMuscular) {
        SessaoTreino sessaoPassada = historico.buscarSessao(new ChaveSessao(semana, grupoMuscular));
        if (!this.sessaoAtual.equals(sessaoPassada)){
            throw new IllegalArgumentException("Grupo muscular diferentes!");
        }
        int porcentagem = 0;
        int volumePassado;



        return porcentagem;

    }
    //TODO fazer método para salvar dia de treino, filtrar por semana/grupo muscular etc.

}
