package edu.marcos.semana06.biblioteca;

public class UsuarioComum extends Pessoa {

    private int limite = 3;


    public int getLimite() {
        return limite;
    }


    public void setLimite(int limite) {
        this.limite = limite;
    }



    public String getPlano() {
        return "\033[7mComum\033[m";
    }
}
