package edu.marcos.primeirasemana;

public class PraticandoOperadores {
    public static void main (String[] args){
    // PROJETO DE UMA CALCULADORA DE ACESSO PREMIUM
    int idade = 19;
    int horasEstudadas = 2;
    boolean ehPremium = false;
    System.out.println("Bem vindo a calculadora de acesso premium! vamos ver se você consegue acessar:");
    System.out.println("Condições (Só precisa de uma pra acessar):" +
            "\n- Idade maior ou igual á 18!"+
            "\n- Ter estudado mais de 3h hoje!"+
            "\n- Ter assinatura premium!");
    String statusAcesso = (idade >= 18 || horasEstudadas >= 3 || ehPremium)
            ? "\033[1;32mAcesso permitido\033[m":"\033[1;31mAcesso Negado!\033[m";

    int minutosEstudados = horasEstudadas * 60;
    System.out.println("Hoje você estudou "+ horasEstudadas + "h, e isso dá no total de "+ minutosEstudados+" minutos!");
    System.out.println("Sua idade: " + idade);
    System.out.println("Horas e minutos estudados: " + horasEstudadas + "h = " + minutosEstudados + "min");
    if (ehPremium){
        System.out.println("Você tem assinatura premium");
    }
    else {
        System.out.println("Você não tem assinatura premium");
    }
    System.out.println(statusAcesso);
}}
