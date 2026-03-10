package edu.marcos.semana15.collections.lists.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormatting {


    public ArrayFormatting() {
    }


    private String indexToMonth(double[] array, int index){
        String month = null;
        if(index>array.length - 1 || index<0){
            throw new ArrayIndexOutOfBoundsException("\033[1;31mIndex out of bounds\033[m");
        }
        switch (index){
            case 0: month = "Janeiro";
                break;
            case 1: month = "Fevereiro";
            break;
            case 2: month = "Março";
            break;
            case 3: month = "Abril";
            break;
            case 4: month = "Maio";
            break;
            case 5: month = "Junho";
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }

        return month;
    }

    private double semesterAverage(double[] array){
        double average = 0;
        double sum = 0;
        if(array.length==0){
            System.out.println("Lista vazia!");
        }
        else{
            for (double value : array) {
                sum += value;
            }
            average = sum / array.length;
        }


        return average;
    }




    public String[] getMonthsAboveAverage(double[] array){
       List<String> months = new ArrayList<>();
       double average = semesterAverage(array);
        for ( int i =0; i < array.length; i++ ) {
            if(array[i] > average){
                months.add(indexToMonth(array, i));
            }
        }

        return months.toArray(new String[months.size()]);


    }
}
