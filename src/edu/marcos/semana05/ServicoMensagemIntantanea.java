package edu.marcos.semana05;

public abstract class ServicoMensagemIntantanea {
    // ABSTRAÇÃO, aqui é declarado os metodos mas não faz nada, se você quiser usar, tera que ter os metodos.
    public abstract void enviarMensagem(String mensagem);
    public abstract void receberMensagem(String mensagem);

    /*
    ENCAPSULAMENTO
    Nem tudo precisa ser visto por todos o pedrinho não precisa toda hora ficar vendo
    o sistema de validação de internet ou salvamento de historico de mensagem
    por isso tornamos os nossos metodos privados, para não ser acessíveis ao resto.
     */

}
