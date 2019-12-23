package com.preparation.Trees;

public class BinarySearchTreeNew {

    public class Node{
        int value;
        Node left, right;
        Node(int value){
            this.value = value;
            left=right=null;
        }
    }

    private Node root;

    private BinarySearchTreeNew(){
        root = null;
    }

    private void insert(int value){
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }

        if (root.value > value){
            root.left = insertRec(root.left, value);
        } else if (root.value < value){
            root.right = insertRec(root.right, value);
        }

        return root;
    }


    public static void main(String[] args) {
        BinarySearchTreeNew binarySearchTree = new BinarySearchTreeNew();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        System.out.println();
    }
}
