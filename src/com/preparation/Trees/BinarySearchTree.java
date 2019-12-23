package com.preparation.Trees;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {

    private void addNode(int value, Node binarySearchTree){
        Node newNode = new Node(value);
        searchAndAddNode(binarySearchTree,newNode);
    }

    private Node searchAndAddNode(Node binarySearchTree, Node newNode) {
        if (binarySearchTree == null){
            binarySearchTree = newNode;
            return binarySearchTree;
        }
        else if (binarySearchTree.getValue() < newNode.getValue()){
            binarySearchTree.setRightNode(searchAndAddNode(binarySearchTree.getRightNode(),newNode));
        }else {
            binarySearchTree.setLeftNode(searchAndAddNode(binarySearchTree.getLeftNode(), newNode));
        }
        return binarySearchTree;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        List<Integer> integerList = Arrays.asList(3,10,1,6,14,4,7,13);
        Node tree = new Node(8);
        for (Integer integer: integerList) {
            binarySearchTree.addNode(integer,tree);
        }
        System.out.println("Done");
    }

}

class Node{

    private int value;

    private Node leftNode;

    private Node rightNode;

    Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }


}