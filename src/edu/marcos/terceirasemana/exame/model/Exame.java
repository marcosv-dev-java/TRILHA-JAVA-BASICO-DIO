package edu.marcos.terceirasemana.exame.model;

public class Exame {
    private boolean vacinaCovid;
    private boolean vacinaTetano;

    public boolean hasVacinaCovid() {
        return vacinaCovid;
    }
    public boolean hasVacinaTetano(){
        return vacinaTetano;
    }
    public void setVacinaCovid(boolean vacinaCovid){
        this.vacinaCovid = vacinaCovid;
    }
    public void setVacinaTetano(boolean vacinaTetano){
        this.vacinaTetano = vacinaTetano;
    }

}