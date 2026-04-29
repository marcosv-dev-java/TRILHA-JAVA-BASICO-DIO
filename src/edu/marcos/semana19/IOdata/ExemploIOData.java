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
        lerProduto(arquivo.getAbsolutePath());
        dos.close();
        sc.close();


    }
    public static void lerProduto(String arquivo) throws IOException {
        File file = new File(arquivo);
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();
        System.out.println("Nome_____:" + nome);
        System.out.println("Quantidade_____:" + quantidade);
        System.out.println("Tamanho_____:" + tamanho);
        System.out.println("Preço_____:" + preco);
        System.out.println("Total do valor das peças: "+ (quantidade*preco));
        dis.close();
    }
}
