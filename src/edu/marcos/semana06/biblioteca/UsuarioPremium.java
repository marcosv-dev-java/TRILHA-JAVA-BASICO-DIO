package edu.marcos.semana06.biblioteca;
public class UsuarioPremium extends Pessoa{
    private int limite = 10;


    public int getLimite() {
        return limite;
    }


    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getPlano() {
        return "\033[7;1;32mPremium\033[m";
    }
}
