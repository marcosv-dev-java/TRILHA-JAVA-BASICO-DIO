package edu.marcos.semana04.banco;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private TipoConta tipoConta;
    public ContaBancaria(String titular, double saldo, TipoConta tipoConta){
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public TipoConta getTipoConta(){
        return this.tipoConta;
    }
    public void mostrarDados(){
        System.out.println("Titular: "+ getTitular());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Tipo Conta: "+ getTipoConta());
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depositando \033[1;32m"+ valor+ "R$\033[m...");
        System.out.println("Saldo atual: \033[1;32m"+ this.saldo+"R$\033[m");
    }
    public void sacar(double valor){
        if(tipoConta.podeSacar(valor, this.getSaldo())) {
            this.saldo -= valor;
            System.out.println("Sacando \033[1;32m"+ valor+ "R$\033[m....");
            System.out.println("Saldo atual: \033[1;32m"+ this.saldo+"R$\033[m");
        }
        else System.out.println("\033[1;31mSaque não permitido\033[m");
    }


}
