package edu.marcos.terceirasemana.exame.service;
import edu.marcos.terceirasemana.exame.model.Exame;

public class ExameService {
    public boolean exameAprovado(Exame exame){
        return exame.hasVacinaCovid() && exame.hasVacinaTetano();
    }
}
