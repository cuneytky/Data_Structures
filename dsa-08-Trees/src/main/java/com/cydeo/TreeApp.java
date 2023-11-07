package com.cydeo;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);
        /*        10
           6              20
        4    8         17      42
          5     9            29   47
         */
        System.out.println("Pre-Order Traversal :");
        tree.preOrderTraversal(tree.root);  // 10, 6, 4, 5, 8, 9, 20, 17, 42, 29, 47,
        System.out.println();

        System.out.println("In Order Traversal :");
        tree.inOrderTraversal(tree.root);  // 4, 5, 6, 8, 9, 10, 17, 20, 29, 42, 47,
        System.out.println();

        System.out.println("Post Order Traversal: ");
        tree.postOrderTraversal(tree.root); // 5, 4, 9, 8, 6, 17, 29, 47, 42, 20, 10,
        System.out.println();

        System.out.println("Level Order Traversal: ");
        tree.levelOrderTraversal();        // 10, 6, 20, 4, 8, 17, 42, 5, 9, 29, 47,

        tree.printLeaves(tree.root);
        System.out.println();

        System.out.println("Number of leaves:  " +tree.countLeaves(tree.root));      //Number of leaves:  5
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root)); // Sum of Leaf Nodes: 107
        System.out.println("Height of the tree is: "+ tree.height(tree.root));       // Height of the tree is: 3
        System.out.println("Sum of Node Depths is: " + tree.calculateNodeDepthSums()); // 0-1-2-3-2-3-1-2-2-3-3
        System.out.println("Sum of all node values is: " + tree.calculateNodeSums());   //Sum of all node values is: 197

    }
}