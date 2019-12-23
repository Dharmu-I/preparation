package com.preparation.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public void buildBinaryTree(Queue<Tree> treeQueue,int[] values){

        int i =1;

        while (i<values.length){
            Tree tree = treeQueue.remove();
            System.out.println("Tree values "+tree);
            if (tree != null){
                if (values[i] != -1) {
                    tree.left = new Tree(values[i]);
                    treeQueue.add(tree.left);
                }else {
                    treeQueue.add(null);
                }
                i=i+1;
                if (i< values.length) {
                    if (values[i] != -1) {
                        tree.right = new Tree(values[i]);
                        treeQueue.add(tree.right);
                    } else {
                        treeQueue.add(null);
                    }
                    i = i + 1;
                }
            }
        }
    }

    public void preOrderTraverser(Tree tree){
        if (tree.left != null)
            preOrderTraverser(tree.left);
        System.out.println(tree.value+"\t");
        if (tree.right != null)
            preOrderTraverser(tree.right);
    }


    public static void main(String[] args) {

        int[] values = new int[]{1,2,3,4,5,-1};
        BinaryTree binaryTree = new BinaryTree();
        Tree tree = new Tree(values[0]);
        Queue<Tree> treesQueue = new LinkedList<>();
        treesQueue.add(tree);
        binaryTree.buildBinaryTree(treesQueue,values);
        binaryTree.preOrderTraverser(tree);
    }
}
