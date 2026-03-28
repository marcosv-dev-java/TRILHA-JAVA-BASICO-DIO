package edu.marcos.semana16.rastreadortreino.repository;
import edu.marcos.semana16.rastreadortreino.model.ChaveSessao;
import edu.marcos.semana16.rastreadortreino.model.SessaoTreino;
import edu.marcos.semana16.rastreadortreino.storage.TreinoStorage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class TreinoRepository {
    TreinoStorage storage;
    private int ultimaSemana;
    private final Map<ChaveSessao, SessaoTreino> diaDeTreino;

    public TreinoRepository(TreinoStorage storage) throws IOException {
        this.storage = storage;
        this.diaDeTreino = new LinkedHashMap<>(storage.carregar());
    }

    public void salvarTreino(ChaveSessao chaveSessao, SessaoTreino sessaoTreino){
        if (this.diaDeTreino.containsKey(chaveSessao)) {
            throw new IllegalArgumentException ("Sessão já adicionada!");
        }
        ultimaSemana = chaveSessao.semana();

        this.diaDeTreino.put(chaveSessao, sessaoTreino);
        storage.salvar(diaDeTreino);
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
