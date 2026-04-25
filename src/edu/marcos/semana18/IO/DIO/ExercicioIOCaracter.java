package edu.marcos.semana18.IO.DIO;

import java.io.*;

public class ExercicioIOCaracter {
    public static void main(String[] args) {
        try {
            receberTeclado();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void receberTeclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Recomende 3 animes: ");
        String linha = br.readLine();


        /* Para impressão no console usando o System.out, o BufferedWriter se torna a pior opção
        Por que sempre precisamos lembrar de dar bw.flush para os dados aparecer
        o System.out.println faz isso sozinho, com o bw se torna mais verboso de forma desnecessária
        Usamos mais o BufferedWriter quando tratamos de Arquivos, Fotos, arquivo de musica etc.
         */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }while(!(linha.isEmpty()));
        bw.flush();
        br.close();
        bw.close();

    }
}
