package edu.marcos.semana05;

public class Telegram extends ServicoMensagemIntantanea{
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo telegram");
        System.out.println(mensagem);

    }

    public void receberMensagem(String mensagem) {
        System.out.println(mensagem);

    }
    // TELEGRAM HERDOU TODOS OS METODOS DA CLASSE PAI
    //PILAR DE HERANÇA
}
