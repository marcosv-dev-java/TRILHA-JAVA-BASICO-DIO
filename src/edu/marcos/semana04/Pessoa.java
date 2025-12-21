package edu.marcos.semana04;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(){
        this("Não definido", "000.000.000-00");

    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
