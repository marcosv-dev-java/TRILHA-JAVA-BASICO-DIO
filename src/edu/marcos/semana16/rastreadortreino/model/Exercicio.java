package edu.marcos.semana16.rastreadortreino.model;

public enum Exercicio {
    //Costas
    PUXADA("Puxada", GrupoMuscular.COSTAS),
    TBAR("T-Bar", GrupoMuscular.COSTAS),

    //Peitoral
    SUPINO_INCLINADO("Supino inclinado", GrupoMuscular.PEITO),
    PARALELA("Paralela", GrupoMuscular.PEITO),
    //Perna
    LEG_PRESS("Leg press", GrupoMuscular.PERNA),
    EXTENSORA("Extensora", GrupoMuscular.PERNA);

    private final String exercicio;
    private final GrupoMuscular grupoMuscular;


    Exercicio(String exercicio, GrupoMuscular grupoMuscular) {
        this.exercicio = exercicio;
        this.grupoMuscular = grupoMuscular;
    }

    public String getExercicio() {
        return exercicio;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }
}
