package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.Arrays;

class Program1 {
    // O(N log N) + O (M log M) | O (1) space where N is length of first array, M is length of second array
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int firstIndex = 0;
        int secondIndex = 0;
        int smallestValue = Integer.MAX_VALUE;
        int currentValue = Integer.MAX_VALUE;
        int[] smallestPair = null;
        while (firstIndex < arrayOne.length && secondIndex < arrayTwo.length) {
            int firstNum = arrayOne[firstIndex];
            int secondNum = arrayTwo[secondIndex];
            if (firstNum < secondNum) {
                currentValue = Math.abs(firstNum - secondNum);
                firstIndex++;
            } else if (firstNum > secondNum) {
                currentValue = Math.abs(firstNum - secondNum);
                secondIndex++;
            } else {
                return new int[] {firstNum, secondNum};
            }
            if (smallestValue > currentValue) {
                smallestValue = currentValue;
                smallestPair = new int[]{firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
