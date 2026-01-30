package edu.marcos.semana09.listadupla;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size(){
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index){ // Metodo privado para ir até o indice que foi pedido.
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;

    }
    public T get(int index){
        return this.getNo(index).getConteudo(); // Dessa lista, ele vai pegar o nó que está no indice que foi solicitado, e vai pegar o conteúdo desse nó.

    }






}
