package edu.marcos.semana03.exame.model;

public class Documentos {
    private boolean rg;
    private boolean cpf;

    public boolean hasRg(){
        return rg;
    }

    public boolean hasCpf(){
        return cpf;
    }
    public void setRg(boolean rg){
        this.rg = rg;
    }
    public void setCpf(boolean cpf){
        this.cpf = cpf;
    }
}
