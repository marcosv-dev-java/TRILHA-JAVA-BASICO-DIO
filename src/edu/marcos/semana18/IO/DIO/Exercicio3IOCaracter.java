package edu.marcos.semana18.IO.DIO;

import java.io.*;

public class Exercicio3IOCaracter {
    public static void main(String[] args) {
        final String filePathName = "C:\\Users\\Marcos\\IdeaProjects\\TRILHA-JAVA-BASICO\\arquivodetexto.txt";
        final String fileName = "arquivodetexto-copy.txt";
        try {
            copyFile(filePathName);
            addInfoInFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void copyFile(String pathName) throws IOException {
        File file = new File(pathName);
        if (!file.exists()) {
            throw new FileNotFoundException(pathName);
        }
        String fileName = file.getName();
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String fileNameCopy = fileName.substring(0, fileName.indexOf(".")).concat("-copy.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameCopy));
        String line;

        while((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        System.out.printf("Arquivo %s copiado para %s", fileName, fileNameCopy);
        System.out.println();
        writer.newLine();
        writer.newLine();
        writer.newLine();
        writer.newLine();
        writer.write("\t\t\t\t\t\t\t\t\t\t===== THIS IS A COPY ONLY =====");
        writer.flush();
        writer.close();
        reader.close();


    }

    public static void addInfoInFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

        String line;
        System.out.println("Escreva a informacao que deseja adicionar no arquivo: (Enter para parar)");
        while (!(line = reader.readLine()).isEmpty()) {
            writer.newLine();
            writer.write(line);
        }




        writer.newLine();
        writer.flush();
        writer.close();
        reader.close();


    }
}
