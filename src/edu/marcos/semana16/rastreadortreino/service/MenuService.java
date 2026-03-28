package edu.marcos.semana16.rastreadortreino.service;

public class MenuService {

    public void linhaFormatada(int largura, String texto) {
        int espaco = (largura - texto.length()) / 2;
        if (espaco <= 0) {
            throw new IllegalArgumentException("Largura muito pequena comparado ao texto!");
        }
        String linha = "=".repeat(espaco);
        System.out.println(linha + " " + texto + " " + linha);
    }
    public void printAnimado(String texto, int velocidade) throws InterruptedException {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            Thread.sleep(velocidade); // milissegundos por letra
        }
        System.out.println();
    }

}
