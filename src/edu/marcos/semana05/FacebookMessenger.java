package edu.marcos.semana05;

public class FacebookMessenger extends ServicoMensagemIntantanea{

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo facebook:");
        System.out.println(mensagem);

    }


    public void receberMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    // FACEBOOK HERDOU TODOS OS METODOS DA CLASSE PAI
    //PILAR DE HERANÇA

}
