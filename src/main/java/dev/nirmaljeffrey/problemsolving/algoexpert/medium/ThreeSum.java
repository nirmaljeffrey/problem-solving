package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    // O( N * N ) time | O (N) Space
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        ArrayList<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int preferredSum = targetSum - array[i];
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;
            while (leftIndex < rightIndex) {
                int leftRightSum = array[leftIndex] + array[rightIndex];
                if (leftRightSum > preferredSum) {
                    rightIndex--;
                } else if (leftRightSum < preferredSum) {
                    leftIndex++;
                } else {
                    list.add(new Integer[]{array[i], array[leftIndex], array[rightIndex]});
                    leftIndex++;
                    rightIndex--;
                }
            }
        }
        return list;
    }
}
