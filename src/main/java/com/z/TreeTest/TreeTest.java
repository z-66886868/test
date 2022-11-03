package com.z.TreeTest;

/**
 * @athor Fly
 * @data 2022/11/3 18:20
 * @Version 1.0
 */
public class TreeTest {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(8);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(2);
        binaryTree.add(15);
        binaryTree.add(14);
        binaryTree.add(18);
        binaryTree.add(19);


        binaryTree.delete(15);

    }

}
