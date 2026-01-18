package edu.marcos.semana07.fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;
    // Lembramos que na estrutura de dados fila entramos no final dela

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public boolean isEmpty(){
        return this.refNoEntradaFila == null ? true : false;
    }
    public void enqueue(T object){ // Metodo enqueue, em português, enfilerar, ele adiciona um novo objeto na fila
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        // O ultimo nó sempre vai estar apontando para o proximo na fila, seguindo essa lógica, esse novo Nó adicionando vai estar apontando para o ultimo anterior
        refNoEntradaFila = novoNo;
        // A referencia de entrada vai ser agora o novo objeto que entrou na fila
    }

    public T first(){ // Metodo para ver o primeiro da fila
        if(!this.isEmpty()){ // Se não estiver vazio executa o código se não, retorna null
            No primeiroNo = refNoEntradaFila; // Criamos um objeto que vai armazenar o primeiro nó, porém, ele começa como ultimo
            while (true){
                if(primeiroNo.getRefNo() != null){ // O primeiro nó sempre vai apontar pra null, então a gente verifica se ele não está apontando pra null
                    primeiroNo = primeiroNo.getRefNo(); // Se não estiver apontando pra null, ele passa a ser o proximo objeto
                }
                else return (T) primeiroNo.getObjeto();

            }
        }
        return null;
    }
    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No auxiliarNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    auxiliarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObjeto();
        }

        else return null;
    }


    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObjeto() + "}]---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno+= "null";
                    break;}
            }

        } else stringRetorno = "null";


        return  stringRetorno;
    }
}
