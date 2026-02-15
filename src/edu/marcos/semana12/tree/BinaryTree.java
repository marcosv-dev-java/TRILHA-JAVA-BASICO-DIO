package edu.marcos.semana12.tree;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }


    private BinaryNode<T> insert(BinaryNode<T> current, BinaryNode<T> newNode) { // Esse metodo ele comeca na raiz e vai ir "caminhando" pelos ramos ate chegar nas folhas

        if (current == null) { // Quando chegar no null, ou chega nos No folhas ele vai adicionar o novo No la
            return newNode;
        }else if (newNode.getContent().compareTo(current.getContent()) < 0){ // Se o No que vai ser adicionado for menor que o No atual, ele vai ir indo pra esquerda, chamando o proprio metodo indo pra esquerda
            current.setLeft(insert(current.getLeft(), newNode)); // Chama o proprio metodo para continuar caminhando, se por acaso, o Novo no for maior que o atual ele cai no else
        }else{ // Se o novo No for maior que o Atual ele cai aqui
            current.setRight(insert(current.getRight(), newNode)); // mesma logica de ir caminhando pra esquerda, so que como e maior deixamos ele a direita.
        }
        return current; // Esse return serve para quando usamos o metodo recursivo, quando setamos para esquerda ou direita ele usa esse return
    }

    public void insert(T content) {
        BinaryNode<T> newNode = new BinaryNode<>(content);
        this.root = insert(root, newNode);
    }
}
