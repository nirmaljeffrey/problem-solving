package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

public class LongestPeak {
    //O (N) time | 0 (1) space
    public static int longestPeak(int[] array) {
        int maxPeakLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i - 1] <  array[i] && array[i] > array[i + 1];
            if (isPeak) {
                int leftIndex = i - 2;
                int rightIndex = i + 2;
                while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
                    leftIndex--;
                }

                while (rightIndex < array.length && array[rightIndex] < array[rightIndex -1]) {
                    rightIndex++;
                }
                // when coming out of while loop, right index is incremented and leftIndex is decremented, so subtract one for
                // calculating peak length
                int currentPeakLength = rightIndex - leftIndex - 1;
                maxPeakLength = Math.max(maxPeakLength, currentPeakLength);
                i = rightIndex;
            } else {
                i++;
            }
        }
        return maxPeakLength;
    }

//    public static void main(String[] args) {
//      int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
//      System.out.println(longestPeak(array));
//    }
}
