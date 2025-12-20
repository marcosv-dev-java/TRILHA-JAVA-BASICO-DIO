package edu.marcos.terceirasemana.exame.controller;
import edu.marcos.terceirasemana.exame.model.*;
import edu.marcos.terceirasemana.exame.service.EntrevistaService;
import java.util.Scanner;


public class ProcessoEntrevistaController {


    public void iniciar(){
        Scanner sc = new Scanner(System.in);
        Documentos docs = new Documentos();
        Exame exame = new Exame();

        System.out.print("Possui RG? (true/false)");
        docs.setRg(sc.nextBoolean());

        System.out.print("Possui CPF? (true/false)");
        docs.setCpf(sc.nextBoolean());

        System.out.print("Possui vacina da COVID? (true/false)");
        exame.setVacinaCovid(sc.nextBoolean());

        System.out.print("Possui vacina do Tétano? (true/false)");
        exame.setVacinaTetano(sc.nextBoolean());

        EntrevistaService service = new EntrevistaService();
        Resultado resultado = new Resultado();

        System.out.println("\nRESULTADO FINAL: ");
        System.out.println(resultado.getMensagem());

        sc.close();

    }
}
