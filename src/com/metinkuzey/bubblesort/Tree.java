package com.metinkuzey.bubblesort;

public class Tree {
    Node root;

    //constructor of Tree
    public Tree() {
        root = null;
    }

    Node newNode(int x) {
        root = new Node(x);
        return root;
    }

    Node insertNode(Node root, int x) {
        if (root != null) {
            if (x < root.data)
                root.left = insertNode(root.left, x);
            else
                root.right = insertNode(root.right, x);
        } else
            root = newNode(x);

        return root;
    }

    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }

    Node deleteNode(Node root, int x){
        Node n1, n2;
        if (root==null)
            return null;

        if (root.data == x){
            if (root.left == root.right){
                return root = null;
            }
            else if (root.left == null){
                n1 = root.right;
                return n1;
            }
            else if (root.right == null){
                n1 = root.left;
                return n1;
            }
            else {
                n1 = n2 = root.right;
                while (n1.left != null){
                    n1 = n1.left;
                }
                n1.left = root.left;
                return n2;
            }
        } else {
            if (x< root.data)
                root.left = deleteNode(root.left,x);
            else
                root.right = deleteNode(root.right,x);
        }
        return root;
    }
}
