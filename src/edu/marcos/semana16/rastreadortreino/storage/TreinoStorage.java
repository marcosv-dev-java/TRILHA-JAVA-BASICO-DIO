package edu.marcos.semana16.rastreadortreino.storage;

import edu.marcos.semana16.rastreadortreino.model.*;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreinoStorage {
    private static final String CAMINHO = "treinos.txt";

    public void salvar(Map<ChaveSessao, SessaoTreino> dados) {
        try (FileWriter fw = new FileWriter(CAMINHO)) {
            dados.forEach((chave, treino) -> {
                treino.getSeriesExercicio().forEach((exercicio, series) -> {
                    series.forEach(serie -> {
                        try {
                            fw.append(chave.semana() + "," + chave.grupo() + "," + exercicio + "," + serie.repeticoes() + "," + serie.carga() + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                });
            });
            // percorre o Map e escreve cada série
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public Map<ChaveSessao, SessaoTreino> carregar() throws IOException {
        Map<ChaveSessao, SessaoTreino> dados = new LinkedHashMap<>();
        File arquivo = new File(CAMINHO);
        if (!arquivo.exists()) return dados;

        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO))) {
            String linha;
            while ((linha = br.readLine()) != null) {

                String[] campos = linha.split(",");
                int semana = Integer.parseInt(campos[0]);
                GrupoMuscular grupo = GrupoMuscular.valueOf(campos[1]);
                Exercicio exercicio = Exercicio.valueOf(campos[2]);
                int repeticoes = Integer.parseInt(campos[3]);
                double carga = Double.parseDouble(campos[4]);

                ChaveSessao chave = new ChaveSessao(semana, grupo);
                dados.computeIfAbsent(chave, k -> new SessaoTreino(grupo))
                        .adicionarSerie(exercicio, new Serie(repeticoes, carga));

            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
        return dados;
    }
}
