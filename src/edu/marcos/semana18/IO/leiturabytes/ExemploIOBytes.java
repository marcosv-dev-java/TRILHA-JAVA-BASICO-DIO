package edu.marcos.semana18.IO.leiturabytes;

import java.io.*;


public class ExemploIOBytes {
    public static void main(String[] args) {
        try {
            copyFile();
        } catch (IOException e) {
            System.err.println("Erro ao copiar!" + e.getCause());
        }

    }

    public static void copyFile() throws IOException {
        File file = new File("C:\\Users\\Marcos\\IdeaProjects\\TRILHA-JAVA-BASICO\\arquivodetexto-copy.txt");
        File fileCopy = new File(file.getName().substring(0, file.getName().indexOf("-")).concat("-copy2.txt"));
        try (BufferedInputStream bufferInput = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream bufferOutput = new BufferedOutputStream(new FileOutputStream(fileCopy))) {


            int bytesRead;
            while ((bytesRead = bufferInput.read()) != -1) {
                bufferOutput.write((char)bytesRead);

            }
            bufferOutput.flush();



        }


    }}
