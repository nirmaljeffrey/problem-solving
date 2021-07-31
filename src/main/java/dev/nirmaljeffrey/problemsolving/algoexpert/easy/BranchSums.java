package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;
// O(N) time | O(N) space, where N is number of nodes
public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list, 0);
        return list;
    }

    private static void preOrderTraversal(BinaryTree tree,ArrayList<Integer> list, int sum) {
       if (tree == null) {
           return;
       }

       sum += tree.value;
        if (tree.left == null && tree.right == null) {
            list.add(sum);
        }
       preOrderTraversal(tree.left, list, sum);
       preOrderTraversal(tree.right, list, sum);
    }

//    public static void main(String[] args) {
//        BinaryTree binaryTree1 = new BinaryTree(1);
//        binaryTree1.right = new BinaryTree(3);
//        binaryTree1.left = new BinaryTree(2);
//        binaryTree1.right.right = new BinaryTree(7);
//        binaryTree1.right.left = new BinaryTree(6);
//        binaryTree1.left.left = new BinaryTree(4);
//        binaryTree1.left.right = new BinaryTree(5);
//        binaryTree1.left.left.left = new BinaryTree(8);
//        binaryTree1.left.left.right = new BinaryTree(9);
//        binaryTree1.left.right.left = new BinaryTree(10);
//        System.out.println(branchSums(binaryTree1));
//    }
}
