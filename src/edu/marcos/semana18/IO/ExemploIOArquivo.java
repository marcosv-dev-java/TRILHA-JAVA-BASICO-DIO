package edu.marcos.semana18.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploIOArquivo {
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void lerArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("arquivodetexto.txt"));
        StringBuilder sb = new StringBuilder();
        String linha;

        while ((linha = br.readLine()) != null){
            sb.append(linha);
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
