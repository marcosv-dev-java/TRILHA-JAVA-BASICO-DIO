package edu.marcos.semana12;

import edu.marcos.semana12.models.Obj;
import edu.marcos.semana12.tree.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Obj> bt = new BinaryTree<>();

        bt.insert(new Obj(115));
        bt.insert(new Obj(20));
        bt.insert(new Obj(60));
        bt.insert(new Obj(33));
        bt.insert(new Obj(22));
        bt.insert(new Obj(12));
        bt.insert(new Obj(17));
        bt.insert(new Obj(992));
        bt.insert(new Obj(231));

        bt.showInOrder();




    }
}
