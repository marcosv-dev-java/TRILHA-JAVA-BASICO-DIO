package edu.marcos.semana06.no;

public class No {
    private String conteudo;
    private No proximoNo;


    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

    public String getConteudo() { return conteudo; }

    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    public No getProximoNo() { return proximoNo; }

    public void setProximoNo(No proximoNo) { this.proximoNo = proximoNo; }

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

}
