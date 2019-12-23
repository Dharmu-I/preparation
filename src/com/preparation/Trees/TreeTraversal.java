package com.preparation.Trees;

import java.util.Stack;

public class TreeTraversal {


    public static void constructTree(Tree root, String[] nodePath) throws Exception {

        for (String rootPath: nodePath){
            String[] pathNodes = rootPath.split("-");
            insertNodeToTree(pathNodes,root,1);
        }
    }

    private static void insertNodeToTree(String[] pathNodes, Tree root, int i) throws Exception {
        if (i == pathNodes.length-1){
            if (root.value != 0){
                throw new Exception("Wrong path");
            }
            root.value = Integer.parseInt(pathNodes[i]);
        }else {
            if (pathNodes[i].equals("L")){
                if (root.left == null){
                    root.left = new Tree();
                }
                insertNodeToTree(pathNodes,root.left,i+1);
            }else {
                if (root.right == null){
                    root.right = new Tree();
                }
                insertNodeToTree(pathNodes,root.right,i+1);
            }

        }
    }


    private static void preOrderTraversal(Tree root) {
        System.out.println(root.value);
        if (root.left != null)
            preOrderTraversal(root.left);
        if (root.right != null)
            preOrderTraversal(root.right);
    }

    private static void inOrderTraversal(Tree root) {
        if (root.left != null)
            inOrderTraversal(root.left);
        System.out.println(root.value);
        if (root.right != null)
            inOrderTraversal(root.right);
    }

    private static void preOrderTraversalWithoutRecursion(Tree root) {
        Stack<Tree> treeStack =  new Stack<>();
        treeStack.push(root);
        while (!treeStack.empty()){
            Tree tree = treeStack.pop();
            System.out.println(tree.value);
            if (tree.right != null) {
                treeStack.push(tree.right);
            }

            if (tree.left != null){
                treeStack.push(tree.left);
            }
        }
    }

    private static void inOrderTraversalWithoutRecursion(Tree root) {
        Stack<Tree> treeStack =  new Stack<>();
        treeStack.push(root);
        while (!treeStack.empty()){
            Tree tree = treeStack.pop();
            if (tree.left != null){
                Tree leftTree = tree.left;
                tree.left = null;
                treeStack.push(tree);
                treeStack.push(leftTree);
            }else {
                System.out.println(tree.value);
                if (tree.right != null){
                    treeStack.push(tree.right);
                }
            }
        }
    }


    private static void postOrderTraversalWithRecursion(Tree root) {
        if(root.left != null){
            postOrderTraversalWithRecursion(root.left);
        }
        if (root.right != null){
            postOrderTraversalWithRecursion(root.right);
        }
        System.out.println(root.value);
    }

    private static void postOrderTraversalWithoutRecursion(Tree root) {

        Stack<Tree> treeStack = new Stack<>();
        treeStack.push(root);
        while (!treeStack.empty()){
            Tree tree = treeStack.pop();
            if (tree.left != null){
                Tree leftTree = tree.left;
                tree.left= null;
                treeStack.push(tree);
                treeStack.push(leftTree);
            }else if (tree.right != null){
                Tree rightTree = tree.right;
                tree.right = null;
                treeStack.push(tree);
                treeStack.push(rightTree);
            }else {
                System.out.println(tree.value);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Tree root = new Tree(1);
        String[] nodePath = {"1-L-2","1-R-3","1-L-L-4","1-L-R-5","1-R-L-6","1-R-R-7"};
        constructTree(root,nodePath);
        System.out.println("Pre order traversal with recursion");
        preOrderTraversal(root);
        System.out.println("\n\nPre order traversal without recursion");
        preOrderTraversalWithoutRecursion(root);
        System.out.println("\n\nIn order traversal with recursion");
        inOrderTraversal(root);
        System.out.println("\n\nIn order traversal without recursion");
        inOrderTraversalWithoutRecursion(root);
        System.out.println("\n\nPost order traversal with recursion");
        postOrderTraversalWithRecursion(root);
        System.out.println("\n\nPost order traversal without recursion");
        postOrderTraversalWithoutRecursion(root);

    }

}
