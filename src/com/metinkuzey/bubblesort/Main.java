package com.metinkuzey.bubblesort;

public class Main {
    public static void main(String[] args) {
        /************** OUR TREE ****************
                            12
                          /   \
                         /     \
                        /       \
                       8         24
                      /\	    / \
                     /  \      /   \
                    /    \    /     \
                   6     10  18     30
        **************************************/
        Tree bst = new Tree();
        bst.root = bst.insertNode(bst.root,12);
        bst.root = bst.insertNode(bst.root,8);
        bst.root = bst.insertNode(bst.root,24);
        bst.root = bst.insertNode(bst.root,6);
        bst.root = bst.insertNode(bst.root,10);
        bst.root = bst.insertNode(bst.root,18);
        bst.root = bst.insertNode(bst.root,30);
        System.out.print("Our BST Tree: ");
        bst.inOrder(bst.root);

        bst.root = bst.deleteNode(bst.root,6);

        System.out.println("After delete the 6 node" + " ---> Root is : " + bst.root.data);
        /************** OUR TREE ****************
                          12
                        /   \
                       /     \
                      /       \
                     8         24
                     \	      / \
                      \      /   \
                       \    /     \
                       10  18     30
         **************************************/
        bst.inOrder(bst.root);
        bst.root = bst.deleteNode(bst.root,24);
        System.out.println("After delete the 24 node" + " ---> Root is : " + bst.root.data);
        /****************************** OUR  NEW TREE *********************************
                            12                                      12
                          /   \                                    / \
                         /     \                                  /   \
                        /       \                                /     \
                       8         30      OR =======>>>          8       18
                        \	     /                              \        \
                         \      /                                \        \
                          \    /                                  \        \
                          10  18                                   10       30
         ********************************************************************************/
        bst.inOrder(bst.root);
        bst.root = bst.deleteNode(bst.root,12);
        System.out.println("After delete the 12 node" + " ---> Root is : " + bst.root.data);
        /******************** OUR  NEW TREE *****************
                           30
                          /  \
                         /    \
                        /      \
                       8         18
                        \
                         \
                          \
                           10
         **************************************************/
        bst.inOrder(bst.root);


    }
}
