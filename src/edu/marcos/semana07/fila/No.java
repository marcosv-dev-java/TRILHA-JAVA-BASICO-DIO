package edu.marcos.semana07.fila;

public class No<T> {
    private T objeto;
    // Diferente da pilha, a fila recebe um objeto
    private No<T> refNo;
    // Tem uma referencia para o proximo nó que começa apontando para o null

    public No(T objeto) {
        this.objeto = objeto;
        this.refNo = null;
    }

    public No() {
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
    public String toString() {
        return "No{" +
                "objeto=" + objeto +
                '}';
    }
}
