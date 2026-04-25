package edu.marcos.semana18.IO.leiturabytes;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExemploIOBytes {
    public static void main(String[] args) {

    }

    public static void copyFile() throws IOException {
        File file = new File("C:\\Users\\Marcos\\IdeaProjects\\TRILHA-JAVA-BASICO\\arquivodetexto-copy.txt");
        try(InputStream in = new FileInputStream(file)){
        }
    }

    public static void qualquerNome() throws IOException {
        File arquivo = new File("logs.txt");
        String linha;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), StandardCharsets.UTF_8))){
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }

    }
}
