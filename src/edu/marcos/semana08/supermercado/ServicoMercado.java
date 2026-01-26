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
                System.out.println("Comprando o pão "+ paoNoTopo.getTipoPao().toString()+"...");
                pessoa.setDinheiro(pessoa.getDinheiro() - paoNoTopo.getValor());
                pilha.pop();
                System.out.println("Pão comprado com sucesso! Saldo atual: "+ pessoa.getDinheiro());
            }

        }

        else System.out.println("Nada para comprar!");

    }




}
