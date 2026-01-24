package edu.marcos.semana08.supermercado;

public class PilhaPao {
    private Pao refProximoPao;
     // Referencia para quando adicionar um pão.


    public PilhaPao() {
        this.refProximoPao = null; // Quando criar uma pilha de pão, o proximo começa como null
    }
    public boolean isEmpty(){
        return this.refProximoPao == null;
    }

    public void novoPao(Pao novoPao){
        Pao auxiliarPao = refProximoPao;
        refProximoPao = novoPao;
        novoPao.setProximoPao(auxiliarPao);
    }

    public  Pao ultimoPao(){
        return this.refProximoPao;
    }

    public Pao removerPao(){
        if(!this.isEmpty()) {
            Pao paoRemovido = refProximoPao;
            refProximoPao = refProximoPao.getProximoPao();
            return paoRemovido;
        }
        return null;
    }


    public String toString(){
         String stringRetorno = "";
         Pao auxiliarPao = refProximoPao;
         while(auxiliarPao != null){

             stringRetorno += "[Pao{TipoPao="+ auxiliarPao.getTipoPao() + "}]-->";
             auxiliarPao = auxiliarPao.getProximoPao();
        }
         stringRetorno += "null";
        return stringRetorno;
    }
}
