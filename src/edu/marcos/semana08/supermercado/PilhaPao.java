package edu.marcos.semana08.supermercado;

public class PilhaPao<T extends Pao> {
    private No<T> topo;

    public PilhaPao() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    public void push(T novoPao){
       No<T> novoNo = new No<>(novoPao);
       novoNo.setProximoNo(topo);
       this.topo = novoNo;
    }

    public T pop(){
        if(!isEmpty()) {
            T noRemovido = topo.getConteudo();
            topo = topo.getProximoNo();
            return noRemovido;
        }
        return null;}


    public T top(){
        return this.topo.getConteudo();
    }

    public String toString(){
        String stringRetorno = "";
        if (this.isEmpty()) {
            stringRetorno = "Vazio";
        }
        else {
            No<T> noAuxiliar = this.topo;
            while (noAuxiliar != null) {
                stringRetorno +=  noAuxiliar.toString();
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        return stringRetorno;
    }


}
