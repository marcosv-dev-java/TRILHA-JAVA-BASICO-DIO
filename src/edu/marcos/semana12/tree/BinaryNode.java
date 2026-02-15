package edu.marcos.semana12.tree;

public class BinaryNode<T extends Comparable<T>> { // qualquer objeto que for definido nesse No precisa ter a interface comparable implementada.
    private T content;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T content) {
        this.content = content;
        this.left = this.right = null;
    }

    public BinaryNode() {
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }


    public String toString() {
        return "BinaryNode{" +
                "content=" + content +
                '}';
    }
}


