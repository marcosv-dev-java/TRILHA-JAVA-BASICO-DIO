package edu.marcos.semana05;

public class MSNMessenger extends ServicoMensagemIntantanea{

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo MSN Messanger");
        System.out.println(mensagem);

    }

    public void receberMensagem(String mensagem) {
        System.out.println(mensagem);

    }
    // MSN MESSENGER HERDOU TODOS OS METODOS DA CLASSE PAI
    // PILAR DE HERANÇA

}
