package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.HashSet;

public class FirstDuplicateValue {
    // O(N) time | O(N) space
    public static int firstDuplicateValueWithHash(int[] array) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return array[i];
            } else {
                set.add(array[i]);
            }
        }
        return -1;
    }
    // O(N) time | O (1) space
    public static int firstDuplicateValue(int[] array) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
             int value = Math.abs(array[i]);
             int index = value - 1;
             if (array[index] < 0) {
                 return value;
             } else {
                 array[index] = -array[index];
             }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        int[] array = {2, 1, 5, 2, 3, 3, 4};
//        System.out.println(firstDuplicateValueWithHash(array));
//        System.out.println(firstDuplicateValue(array));
//    }
}
