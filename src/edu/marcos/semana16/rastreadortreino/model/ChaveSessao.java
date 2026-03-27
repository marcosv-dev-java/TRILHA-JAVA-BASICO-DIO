package edu.marcos.semana16.rastreadortreino.model;
import java.util.Objects;

public record ChaveSessao(int semana, GrupoMuscular grupo) {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChaveSessao that = (ChaveSessao) o;
        return semana == that.semana && grupo == that.grupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(semana, grupo);
    }

    @Override
    public String toString() {
        return "ChaveSessao[" +
                "semana=" + semana + ", " +
                "grupo=" + grupo + ']';
    }

}
