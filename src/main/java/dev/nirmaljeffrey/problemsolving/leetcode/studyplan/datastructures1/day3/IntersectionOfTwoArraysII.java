package dev.nirmaljeffrey.problemsolving.leetcode.studyplan.datastructures1.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 *
 */
class IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
       HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : nums1) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int value : nums2) {
            int count = map.getOrDefault(value, 0);
            if (count > 0) {
                list.add(value);
                map.put(value, count - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int value : list) {
            result[i++] = value;
        }

        return result;
    }

    public static int[] intersectUsingSortAndTwoPointers(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        int[] result = new int[nums1.length * nums2.length];
       int p1 = 0;
       int p2 = 0;
       int i = 0;
       while (p1 < nums1.length && p2 < nums2.length) {
           if (nums1[p1] < nums2[p2]) {
               p1++;
           } else if (nums1[p1] > nums2[p2]) {
               p2++;
           } else {
               result[i] = nums1[p1];
               i++;
               p1++;
               p2++;
           }
       }

        return Arrays.copyOfRange(result, 0, i);
    }
//    public static void main(String[] args) {
//        int[] array1 = {4,9,5};
//        int[] array2 = {9,4,9,8,4};
//        System.out.println(Arrays.toString(intersect(array1, array2)));
//        System.out.println(Arrays.toString(intersectUsingSortAndTwoPointers(array1, array2)));
//    }
}