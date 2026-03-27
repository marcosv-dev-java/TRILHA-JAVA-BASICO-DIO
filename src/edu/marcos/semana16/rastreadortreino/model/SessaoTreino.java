package edu.marcos.semana16.rastreadortreino.model;


import java.time.LocalDate;
import java.util.*;

public class SessaoTreino {
    private Map<Exercicio, List<Serie>> seriesExercicio;
    private final GrupoMuscular grupoMuscular;
    private final LocalDate data;

    public SessaoTreino(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
        this.seriesExercicio = new LinkedHashMap<>();
        this.data = LocalDate.now();

    }
    public void adicionarSerie(Exercicio exercicio, Serie serie) {
        seriesExercicio.computeIfAbsent(exercicio, k -> new ArrayList<>()).add(serie);
    }

    public LocalDate getData() {
        return data;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public Map<Exercicio, List<Serie>> getSeriesExercicio() {
        return seriesExercicio;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SessaoTreino that)) return false;
        return grupoMuscular == that.grupoMuscular;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(grupoMuscular);
    }
}
