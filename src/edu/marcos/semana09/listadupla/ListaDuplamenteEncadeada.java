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
        return this.tamanhoLista;
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

    public void add(T elemento){ // Metodo add() sem precisar de indice, ele apenas adiciona ao final da lista
        NoDuplo<T> novoNo = new NoDuplo<>(elemento) ;
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            this.primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index,T elemento){ // Metodo add com indice
        NoDuplo<T> noAuxiliar = getNo(index); // No auxiliar que vai guardar o objeto que está no indice que foi solicitado
        NoDuplo<T> novoNo = new NoDuplo<>(elemento); // Novo nó que recebe o elemento que está no parametro
        novoNo.setNoProximo(noAuxiliar); // O novo nó empurra o nó que estava no indice antes para o lado

        if(novoNo.getNoProximo() != null){ // Essa condição verifica se não está no final da lista, por exemplo, se o no Auxiliar que é o que está no indice que foi solicitado estiver nulo, significa que ele é o final da lista. se a condição é verdadeira é por conta que está no meio da lista
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); // Ele assume o nó previo do objeto que estava no indice antes.
            novoNo.getNoProximo().setNoPrevio(novoNo); // o nó auxiliar que empurramos pro lado fazemos "enxergar" o novo nó que está atrás dele.
        }
        else{ // Se a condição for falsa, ou seja se estiver no final da lista
            novoNo.setNoPrevio(ultimoNo); // O objeto que está no final da lista obviamente é o ultimo nó, nós "empurramos" o antigo ultimo nó para tras
            ultimoNo = novoNo; // Atualizamos o ultimo nó
        }
        if (index == 0){// se for o primeiro nó
            primeiroNo = novoNo; // Atualizamos o primeiro nó
        }
        else { // Se não for o primeiro nó, a gente pega o nó que está atrás, e fazemos "enxergar" o novo nó
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;


    }






}
