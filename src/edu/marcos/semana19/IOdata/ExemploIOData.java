package edu.marcos.semana19.IOdata;

import java.io.*;
import java.util.Scanner;

public class ExemploIOData {
    public static void main(String[] args) {
        try {
            incluirProduto();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void incluirProduto() throws IOException {
        File arquivo = new File("C:\\Users\\Marcos\\Documents\\peca-de-roupa.bin");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da peça: ");
        String nomeDaPeca = sc.nextLine();
        dos.writeUTF(nomeDaPeca);
        System.out.println("Tamanho da peça (P/M/G/XG)");
        char tamanho = sc.nextLine().charAt(0);
        dos.writeChar(tamanho);
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        dos.writeInt(quantidade);
        System.out.println("Preço unitário: ");
        double preco = sc.nextDouble();
        dos.writeDouble(preco);
        dos.close();
        sc.close();


    }
    public static void lerProduto(String arquivo){

    }
}
