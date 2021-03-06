package dev.nirmaljeffrey.problemsolving.leetcode.studyplan.datastructures1.day1;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23


Constraints:

1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105

 */
public class MaximumSumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], (nums[i] + maxCurrent));
            if (maxGlobal < maxCurrent) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

//    public static void main(String[] args) {
//        int[] array1 = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] array2 = {1};
//        System.out.println(maxSubArray(array1));
//        System.out.println(maxSubArray(array2));
//    }
}
