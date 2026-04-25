package edu.marcos.semana18.IO.diario;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DiarioEstudo {
    static final Path ARQUIVO = Path.of("diario.txt");

    public static void main(String[] args) {
        try {
            exibirHistorico();
            String entrada = lerEntrada();
            salvarEntrada(entrada);
            System.out.println("Salvo!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String lerEntrada() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        StringBuilder sb = new StringBuilder();
        System.out.println("Escreva o que estudou hoje. (ENTER PARA PARAR)");
        while((entrada = br.readLine()) != null) {
            if(entrada.trim().isEmpty()) {
                System.out.println("Tem certeza que deseja parar? [Y]");
                String resposta = br.readLine();
                if (resposta != null && resposta.trim().equalsIgnoreCase("y")) break;
            }
                else sb.append(entrada).append("\n");
        }
        return  sb.toString().trim();
    }

    private static void exibirHistorico() throws IOException {
        if (Files.notExists(ARQUIVO)) {
            System.out.println("Nenhum registro ainda.\n");
            return;
        }
        List<String> lidas = Files.readAllLines(ARQUIVO);
        lidas.forEach(System.out::println);

    }

    static void salvarEntrada(String entrada) throws IOException {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHora = agora.format(fmt);
        String dataHoraFinal = "[" + dataHora + "] ";
        String linha = dataHoraFinal + entrada;

        Files.write(ARQUIVO, List.of(linha),  StandardOpenOption.CREATE,StandardOpenOption.APPEND);


    }
}
