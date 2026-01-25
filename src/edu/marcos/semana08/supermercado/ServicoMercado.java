package edu.marcos.semana08.supermercado;

public class ServicoMercado {
    private PilhaPao pilha;


    public ServicoMercado(PilhaPao pilha) {
        this.pilha = pilha;
    }

    public void comprarPao(Pessoa pessoa){
        if(!this.pilha.isEmpty()){
            Pao paoNoTopo = this.pilha.top();
            if (pessoa.getDinheiro() >= paoNoTopo.getValor()){
                pessoa.setDinheiro(pessoa.getDinheiro() - paoNoTopo.getValor());
                pilha.pop();
            }

        }

        else System.out.println("Nada para comprar!");

    }




}
