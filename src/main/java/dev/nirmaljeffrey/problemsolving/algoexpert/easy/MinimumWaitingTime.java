package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

import java.util.Arrays;

public class MinimumWaitingTime {
   // O(N log N) time | O(1) space
    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        if (queries.length < 2) {
            return 0;
        }
        Arrays.sort(queries);

        for (int i = 1; i < queries.length; i++) {
            queries[i] =  queries[i - 1] + queries[i];
        }

        int waitingTime = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            waitingTime += queries[i];
        }


        return waitingTime;
    }

//    public static void main(String[] args) {
//        int[] array = {3, 2, 1, 2, 6};
//        System.out.println(minimumWaitingTime(array));
//    }
}
