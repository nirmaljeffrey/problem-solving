package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return findDepthOfAllNodes(root, 0);
    }

    private static int findDepthOfAllNodes(BinaryTree node, int depth) {
        if (node == null) {
            return 0;
        }

        return depth + findDepthOfAllNodes(node.left, depth + 1) + findDepthOfAllNodes(node.right, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

//    public static void main(String[] args) {
//        //          16      --- depth 0
//        //        /   \
//        //      8      18   --- depth 1 + 1 = 2
//        //     / \     / \
//        //    5  9   17  22 --- depth 2 + 2 + 2 + 2 = 8
//        //   /
//        //  2               --- depth 3
//        //                  --- total depth: 0 + 2 + 8 + 3 = 13
//        BinaryTree binaryTree1 = new BinaryTree(16);
//        binaryTree1.right = new BinaryTree(18);
//        binaryTree1.left = new BinaryTree(8);
//        binaryTree1.left.left = new BinaryTree(5);
//        binaryTree1.left.right = new BinaryTree(9);
//        binaryTree1.left.left.left = new BinaryTree(2);
//        binaryTree1.right.left = new BinaryTree(17);
//        binaryTree1.right.right = new BinaryTree(22);
//        System.out.println(findDepthOfAllNodes(binaryTree1, 0));
//    }
}
