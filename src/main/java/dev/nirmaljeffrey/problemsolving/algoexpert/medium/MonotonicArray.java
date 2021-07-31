package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

public class MonotonicArray {
    // O(N) time | O(1) space
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean isDecreasing = true;
        boolean isIncreasing = true;

        for (int i = 1;i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                isDecreasing = false;
            }
            if (array[i - 1] > array[i]) {
                isIncreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }

    public static void main(String[] args) {
        int[] array = {1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic(array));
    }
}
