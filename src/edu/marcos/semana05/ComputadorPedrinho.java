package edu.marcos.semana05;

import java.util.Scanner;

public class ComputadorPedrinho {
    // PROGAMA MAIN ONDE TUDO RODA
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MSNMessenger msn = new MSNMessenger();
        System.out.println("___--- ABRINDO MSN MESSENGER ---___");
        String msg = input.nextLine();
        msn.enviarMensagem(msg);
        msn.receberMensagem("olaa!");

        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("___--- ABRINDO FACEBOOK ---___");
        msg = input.nextLine();
        fcb.enviarMensagem(msg);
        fcb.receberMensagem("uiii");


        Telegram tlg = new Telegram();
        System.out.println("___--- ABRINDO TELEGRAM ---___");
        System.out.print("Enviar mensagem: ");
        msg = input.nextLine();
        tlg.enviarMensagem(msg);
        tlg.receberMensagem("olaa!");

    }
}
