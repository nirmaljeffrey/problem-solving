package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

public class ArrayOfProducts {
    // O(N) time | O(N) space
    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] outputArray = new int[array.length];
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            outputArray[i] = product;
            product *= array[i];
        }

        product = 1;

        for (int i = array.length - 1; i >= 0; i--) {
            outputArray[i] *= product;
            product*= array[i];
        }
        return outputArray;
    }

//    public static void main(String[] args) {
//        int[] array = {5, 1, 4, 2};
//        System.out.println(Arrays.toString(arrayOfProducts(array)));
//    }
}
