package edu.marcos.semana16.rastreadortreino.repository;
import edu.marcos.semana16.rastreadortreino.model.ChaveSessao;
import edu.marcos.semana16.rastreadortreino.model.SessaoTreino;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class TreinoRepository {
    private int ultimaSemana;
    private final Map<ChaveSessao, SessaoTreino> diaDeTreino;

    public TreinoRepository() {
        this.diaDeTreino = new LinkedHashMap<>();
    }

    public void salvarTreino(ChaveSessao chaveSessao, SessaoTreino sessaoTreino){
        if (this.diaDeTreino.containsKey(chaveSessao)) {
            throw new IllegalArgumentException ("Sessão já adicionada!");
        }
        ultimaSemana = chaveSessao.semana();
        this.diaDeTreino.put(chaveSessao, sessaoTreino);
    }
    public SessaoTreino buscarSessao(ChaveSessao chaveSessao){
        if (!this.diaDeTreino.containsKey(chaveSessao)) {
            throw new IllegalArgumentException("Chave não encontrada!");
        }
        return this.diaDeTreino.get(chaveSessao);

}

    public int getUltimaSemana() {
        return ultimaSemana;
    }

    public Map<ChaveSessao, SessaoTreino> getDiaDeTreino() {
        return Collections.unmodifiableMap(diaDeTreino);
    }
}
