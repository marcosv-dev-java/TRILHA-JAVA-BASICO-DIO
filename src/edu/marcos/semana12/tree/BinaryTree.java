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

    public void showInOrder(){
        System.out.println(" Exibindo em ordem");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> current){
        if (current != null){
            showInOrder(current.getLeft());
            System.out.println(current.getContent() + ", ");
            showInOrder(current.getRight());
        }
    }

    public void showPreOrder(){
        System.out.println(" Exibindo pre ordem");
        showPreOrder(this.root);
    }
    private void showPreOrder(BinaryNode<T> current){
        if (current != null){
            System.out.println(current.getContent() + ", ");
            showPreOrder(current.getLeft());
            showPreOrder(current.getRight());

        }
    }


    public void showPostOrder(){
        System.out.println(" Exibindo pos ordem");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> current){
        if (current != null){
            showPostOrder(current.getLeft());
            showPostOrder(current.getRight());
            System.out.println(current.getContent() + ", ");
        }
    }
    public void remove(T content){ //Recebe o conteudo que vai ser removido
        try {
            BinaryNode<T> current = this.root; // Atual que é a raiz
            BinaryNode<T> father = null; // Pai do nó que vai ser removido que começa como null
            BinaryNode<T> son; // Nó filho
            BinaryNode<T> temp;

            while (current != null && !current.getContent().equals(content)) { // Primeiro caso: Esse while tem o objetivo de fazer o atual(current), representar o nó que vai ser removido e o pai representar o pai do atual
                father = current;
                if (content.compareTo(current.getContent()) < 0) {
                    current = current.getLeft();
                } else current = current.getRight();
            }


            if (current == null) { // Se o conteudo não for encontrado, ele não existe
                System.out.println("\033[1;31mContent not found. Try\033[m");
                return; // Codigo encerra para evitar erros
            }


            if (father == null) { //Segundo caso: Se for a raiz

                if (current.getRight() == null) { // Se a raiz não tiver familia a direita simplesmente a esquerda assume

                    this.root = current.getLeft();

                }



                else if (current.getLeft() == null) {// Se a raiz não tiver familia a esquerda simplesmente a direita assume

                    this.root = current.getRight();

                }


                else { // Se tiver filho nos 2 lados
                    for (temp = current, son = current.getLeft(); // Temp começa pela raiz, o filho pula pra esquerda.
                         son.getRight() != null; // Enquanto tiver um valor maior, ou seja enquanto tiver pra onde ir a direita
                         temp = son, son = son.getRight()) // O temp assume como pai e o filho pula pra direita
                        // A logica desse for é fazer o maior valor da esquerda assumir como raiz

                    {
                        if (son != current.getLeft()) { // Se não for a primeira vez rodando o laço for
                            temp.setRight(son.getLeft());  // Como vamos percorrer o lado direito inteiro, nos so precisamos salvar o lado esquerdo,
                            // /\/\/\ O pai do Filho assume o lado esquerdo do filho
                            son.setLeft(current.getLeft()); // A esquerda do filho fica com a parte esquerda inteira da raiz
                        }

                    }
                    son.setRight(current.getRight()); // Quando terminar o codigo, o No que chegamos, assume o lugar da raiz ou seja, o maior No da esquerda
                    root = son;
                }
            }




                else if(current.getRight() == null){// Terceiro caso: Se tiver so filho na esquerda
                    if(father.getLeft() == current){ // Se Current < Father
                        father.setLeft(current.getLeft()); // O father ignora o no que vai ser removido, que esta no lado esquerdo, e segura o lado esquerdo do No que foi removido
                    }
                    else{ // Se Current > Father
                        father.setRight(current.getLeft()); // Mesma logica de que se for menor, porem vai ser pelo lado direito
                    }

                }

                else if(current.getLeft() == null){ // Quarto caso: Se tiver so filho na direita
                    // Mesma logica de que so tiver filho na esquerda, o pai ignora o filho e segura o lado que o filho segurava antes
                if(father.getLeft() == current){
                    father.setLeft(current.getRight());
                }
                else{
                    father.setRight(current.getRight());
                }
            }


                else{ // Quinto caso: se tiver 2 filhos
                    for(
                            temp = current, son = current.getLeft(); // Temp = No que vai ser removido, Filho pula pro lado Esquerdo do No que vai ser removido
                            son.getRight() != null; // Enquanto tiver para onde ir no lado direito
                            temp = son, son = son.getRight() // O temp e igual ao Filho, e o filho pula pro lado direito, buscando sempre o maior localizado do lado esquerdo
                            ) { // Objetivo desse laco for e semelhante ao caso de se for a raiz, fazer o filho(son) buscar o maior valor do lado esquerdo
                        if (son != current.getLeft()) { // Se nao for a primeira vez rodando
                            temp.setRight(son.getLeft());// O Pai do filho assume no lado direito, o lado esquerdo do filho
                            son.setLeft(current.getLeft());// O filho, como o temp ta assumindo todos do lado esquerdo do caminho que ele ta percorrendo, Ele assume o lado esquerdo do No que vai ser removido
                        }
                    }
                        son.setRight(current.getRight()); // Quando acabar o laco for ele assume o lado direito do No que vai ser removido
                        if(father.getLeft() == current){ // Se o No que vai ser removido < Father
                            father.setLeft(son); // Ele seta a esquerda o caminho que o filho organizou
                        }
                        else{ // Se o no que vai ser removido > Father
                            father.setRight(son); // Ele seta a direita o caminho que o filho organizou

                        }

                    }


        }catch(NullPointerException error){
            System.out.println("\033[1;31mContent not found. Catch\033[m");
        }
    }





}
