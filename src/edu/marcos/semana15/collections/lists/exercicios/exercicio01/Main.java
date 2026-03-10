package edu.marcos.semana15.collections.lists.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayFormatting arrayFormatting = new ArrayFormatting();
        Scanner scanner = new Scanner(System.in);
        double[] temperaturasDoAno = new double[6];

        System.out.print("Digite a temperatura de Janeiro: ");
        temperaturasDoAno[0] = scanner.nextDouble();
        System.out.print("Digite a temperatura de Fevereiro: ");
        temperaturasDoAno[1] = scanner.nextDouble();
        System.out.print("Digite a temperatura de Marco: ");
        temperaturasDoAno[2] = scanner.nextDouble();
        System.out.print("Digite a temperatura de Abril: ");
        temperaturasDoAno[3] = scanner.nextDouble();
        System.out.print("Digite a temperatura de Maio: ");
        temperaturasDoAno[4] = scanner.nextDouble();
        System.out.print("Digite a temperatura de Junho: ");
        temperaturasDoAno[5] = scanner.nextDouble();

        String[] meses = arrayFormatting.getMonthsAboveAverage(temperaturasDoAno);

        for (String mes : meses){
            System.out.println(mes);
        }

        scanner.close();

    }
}
