package edu.marcos.semana07.fila;

public class Fila {
    private No refNoEntradaFila;
    // Lembramos que na estrutura de dados fila entramos no final dela

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public boolean isEmpty(){
        return this.refNoEntradaFila == null ? true : false;
    }
    public void enqueue(No novoNo){ // Metodo enqueue, em português, enfilerar, ele adiciona um novo objeto na fila
        novoNo.setRefNo(refNoEntradaFila);
        // O ultimo nó sempre vai estar apontando para o proximo na fila, seguindo essa lógica, esse novo Nó adicionando vai estar apontando para o ultimo anterior
        refNoEntradaFila = novoNo;
        // A referencia de entrada vai ser agora o novo objeto que entrou na fila
    }


}
