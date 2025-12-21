package edu.marcos.semana03.exame.service;
import edu.marcos.semana03.exame.model.Exame;

public class ExameService {
    public boolean exameAprovado(Exame exame){
        return exame.hasVacinaCovid() && exame.hasVacinaTetano();
    }
}
