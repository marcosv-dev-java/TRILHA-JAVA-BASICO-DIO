package edu.marcos.semana18.IO;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2Caractere {
    public static void main(String[] args) {
        try {
            lerTecladoEscreverDocumento();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void lerTecladoEscreverDocumento() throws IOException {
        LocalDate data = LocalDate.now();
        PrintWriter out = new PrintWriter(System.out);
        out.println("Digite 3 recomendações de animes: ");
        out.flush();
        File file = new File("recomendacoes.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        Scanner sc = new Scanner(System.in);
        bw.write("____________________________");
        bw.newLine();
        for (int i = 0; i < 3; i++) {
            String linha = sc.nextLine();
            bw.write((i+1) + " - " + linha + " - " +data);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        sc.close();
        out.close();


    }
}
