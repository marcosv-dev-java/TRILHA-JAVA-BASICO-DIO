package edu.marcos.semana07.fila;

public class No {
    private Object objeto;
    // Diferente da pilha, a fila recebe um objeto
    private No refNo;
    // Tem uma referencia para o proximo nó que começa apontando para o null

    public No(Object objeto) {
        this.objeto = objeto;
        this.refNo = null;
    }

    public No() {
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
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
