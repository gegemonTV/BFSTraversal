package com.satanbakespancakes;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(6);
        bt.add(10);
        bt.add(15);
        bt.add(0);

        bt.traverseLevelOrder();
    }
}
