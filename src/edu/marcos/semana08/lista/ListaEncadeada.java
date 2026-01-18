package edu.marcos.semana08.lista;

public class ListaEncadeada <T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }
    public boolean isEmpty(){
        return this.referenciaEntrada == null;
    }
    public int size(){ // É uma metodo ultizado para medir o tamanho da lista
        int tamanhoLista = 0; // Variavel local que inicia como 0, vai ser usada para contar quanto a lista mede
        No<T> referenciaAux = this.referenciaEntrada; // Objeto local que vai entrar na fila pelo começo
        while (referenciaAux != null){ // Enquanto não for null, ou seja, se não estiver no ultimo a lista vai seguir
                tamanhoLista++; // Aumenta a contagem
                referenciaAux = referenciaAux.getProximoNo(); // Pula pro proximo da lista
            }
        return tamanhoLista;

    }
    public void add(T conteudo){ // Metodo para adicionar um novo elemento na lista, esse metodo em si adiciona pelo final da lista
        No<T> novoNo = new No<>(conteudo); // Objeto local que vai representar o conteudo que será adicionado
        if(this.isEmpty()) { // Se estiver vazio
            referenciaEntrada = novoNo; // A referencia da entrada simplesmente passa a ser o último nó
            return; // O return da o comando para o java para dizer que o metodo termina aqui, mesmo sendo void
        }
        No<T> noAuxiliar = referenciaEntrada; // Objeto local que vai entrar na lista pelo começo dela e caminhar até o null (final)
        for (int i = 0; i < this.size()-1; i++){ // Estrutura de repetição que vai percorrer até o ultimo nó da lista
            noAuxiliar = noAuxiliar.getProximoNo(); // vai passando para o proximo
        }
        noAuxiliar.setProximoNo(novoNo); // quando chegar no ultimo, ele deixar de apontar para null, e passa a pontar para o novo elemento que foi adicionado

    }
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index ;i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }
    private void validaIndice(int index){
        if (index >= this.size()){
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("\033[1;31mNão existe conteúdo no índice "+ index + " desta lista!\033[m Essa lista só vai até o indice " + ultimoIndice);
        }
    }


    public T get(int index){
        return getNo(index).getConteudo();

    }


}
