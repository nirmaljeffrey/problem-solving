package dev.nirmaljeffrey.problemsolving.leetcode.studyplan.datastructures1;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return nums.length > set.size();
    }

//    public static void main(String[] args) {
//        int[] array1 = {1,1,1,3,3,4,3,2,4,2};
//        int[] array2 = {1,2,3,4};
//        System.out.println(containsDuplicate(array1));
//        System.out.println(containsDuplicate(array2));
//    }
}
