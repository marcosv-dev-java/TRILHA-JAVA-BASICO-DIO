package edu.marcos.semana15.collections.map.exercicios.exercicio01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class MapFormatacao {
    public void exibirFormatado(Map<String,Integer> map){
        NumberFormat formatado = NumberFormat.getInstance(new Locale("pt", "BR"));
        map.forEach((s,i) ->{
            System.out.println("___________________________________");
            System.out.println(s + " = " + formatado.format(i));
        });
    }
}
