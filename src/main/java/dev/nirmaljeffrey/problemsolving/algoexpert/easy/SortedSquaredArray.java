package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

class Program1 {
     // O (N) time | O(N) space
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] outputArray = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        int i = array.length - 1;
        while (left <= right && i >= 0) {
            int absoluteLeftValue = Math.abs(array[left]);
            int absoluteRightValue = Math.abs(array[right]);
            if (absoluteLeftValue > absoluteRightValue) {
                outputArray[i] = absoluteLeftValue * absoluteLeftValue;
                left++;
            } else if (absoluteLeftValue < absoluteRightValue) {
                outputArray[i] = absoluteRightValue * absoluteRightValue;
                right--;
            } else {
                outputArray[i] = absoluteLeftValue * absoluteLeftValue;
                left++;
            }
            i--;
        }

        return outputArray;
    }

//    public static void main(String[] args) {
//        int[] array = {-5, -4, -3, -2, -1};
//       System.out.println(Arrays.toString(sortedSquaredArray(array)));
//    }
}