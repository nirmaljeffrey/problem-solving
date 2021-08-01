package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    // 0(N LOG N) time | O(N) space
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> mergeList = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergeList.add(currentInterval);
        for (int i = 1; i < intervals.length; i++) {
               int[] lastElementInMergeArray = mergeList.get(mergeList.size() - 1);
               if (lastElementInMergeArray[1] >= intervals[i][0]) {
                   lastElementInMergeArray[1] = Math.max(lastElementInMergeArray[1], intervals[i][1]);
               } else {
                   mergeList.add(intervals[i]);
               }
        }
        return mergeList.toArray(new int[mergeList.size()][2]);
    }

//    public static void main(String[] args) {
//        int[][] array = {
//                {1, 2},
//                {2, 3},
//                {3, 8},
//                {9, 10}
//        };
//        System.out.println(Arrays.deepToString(mergeOverlappingIntervals(array)));
//    }
}
