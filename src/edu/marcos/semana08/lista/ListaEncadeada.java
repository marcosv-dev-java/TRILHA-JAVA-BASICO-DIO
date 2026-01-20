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
    private No<T> getNo(int index){ // Metodo que retorna um nó em uma posição especifica definida pelo indice socilitado
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada; // Nó auxiliar que vai entrar na lista pelo começo dela
        No<T> noRetorno = null; // Nó que vai ser retornado, inicialmente começa como null
        for (int i = 0; i <= index ;i++){ // estrutura de repetição que caminha até o indice solicitado
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }
    private void validaIndice(int index){ // metodo que valida se o indice é maior que o tamanho da lista
        if (index >= this.size()){
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("\033[1;31mNão existe conteúdo no índice "+ index + " desta lista!\033[m Essa lista só vai até o indice " + ultimoIndice);
        }
    }
    public T remove(int index){ // Metodo para remover Nó em determinado indice
        No<T> noRemovido = this.getNo(index); // Usa o metodo getNo para atibuir o nó no indice ao no removido
        if (index == 0){ // Se o indice for igual a 0, a lista vai dar erro por conta de não ter mais referencia de entrada
            referenciaEntrada = noRemovido.getProximoNo(); // Referencia de entrada passa pro proximo nó, esquecendo o que tava antes, por exemplo em um contexto de números, a entrada atual é o 0, a entrada passa a ser o 1.
            return noRemovido.getConteudo(); // Retorna o nó que vai ser removido
        }
        No<T> noAnterior = getNo(index-1); // Antes de removermos o nó, precisamos mudar para quem o nó anterior vai apontar, para que ele não fique apontando para null, então criamos um objeto para representar o nó anterior
        noAnterior.setProximoNo(noRemovido.getProximoNo()); // o Nó anterior do que será removido, passa a ver o proximo nó, por exemplo 1 que depois viria o 2 pula direto pro 3, ficando assim = 1, 3, 4, 5, 6..
        return noRemovido.getConteudo();//Retorna o nó que vai ser removido
    }


    public T get(int index){ // Metodo com mesmo intuito do getNo, porém é publico
        return getNo(index).getConteudo();

    }


    public String toString() {
        return "ListaEncadeada{" +
                "referenciaEntrada=" + referenciaEntrada +
                '}'; // TODO Personalizar o metodo to string
    }
}
