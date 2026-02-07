package edu.marcos.semana10.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca; // ultimo
    private No<T> cauda; // primeiro
    private int tamanhoLista;


    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()) throw  new IndexOutOfBoundsException("A lista está vazia!");
        if (index == 0 ){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < index; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    public void remove(int index){
        if( index >= this.tamanhoLista )
            throw new IndexOutOfBoundsException("Indice maior que o tamanho da lista!");

        if (index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        }
        else if (index == 1 ){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }
        else {

            No<T> noAuxiliar = this.getNo(index - 1);
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T elemento){
        No<T> novoNo = new No<>(elemento);
        if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        }
        else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            stringRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno += this.isEmpty() ?"(Retorna ao inicio)": "[]";
        return stringRetorno;
    }
}
