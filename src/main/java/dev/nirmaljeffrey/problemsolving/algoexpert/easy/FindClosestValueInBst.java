package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

public class FindClosestValueInBst {
    // AVERAGE: O (LOG N) time | O (H) space where H is height of the tree - balanced tree
    // WORST: O(N) time | O(N) space, height and number of elements are same in skewed tree - skewed tree
    public static int findClosestValueInBstRecursive(BST tree, int target) {
       return find(tree, target, Integer.MAX_VALUE, -1);
    }

    private static int find(BST tree, int target, int minValue, int value) {
        if (tree == null) {
            return value;
        }
        if (minValue > Math.abs(tree.value - target)) {
            minValue = Math.abs(tree.value - target);
            value = tree.value;
        }
        if (tree.value > target) {
            value = find(tree.left, target, minValue, value);
        } else if (tree.value < target) {
            value  = find(tree.right, target, minValue, value);
        }
        return value;
    }
    // AVERAGE: O (LOG N) time | O (1) space - balanced tree
    // WORST: O(N) time | O(1) space - skewed tree
    public static int findClosestValueInBstIterative(BST tree, int target) {
        BST currentNode = tree;
        int minValue = Integer.MAX_VALUE;
        while (currentNode != null) {
            if (Math.abs(minValue - target) > Math.abs(currentNode.value - target)) {
                minValue = currentNode.value;
            }
            if (currentNode.value > target) {
                currentNode = currentNode.left;
            } else if (currentNode.value < target) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return minValue;
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

//    public static void main(String[] args) {
//        BST bst1 = new BST(10);
//        BST bst2 = new BST(5);
//        BST bst3 = new BST(15);
//        bst1.right = bst3;
//        bst1.left = bst2;
//        System.out.println(findClosestValueInBstRecursive(bst1, 15));
//        System.out.println(findClosestValueInBstIterative(bst1, 15));
//
//    }
}
