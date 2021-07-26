package dev.nirmaljeffrey.problemsolving.leetcode;

import java.util.HashSet;

/**
 * leetcode submission url - https://leetcode.com/submissions/detail/518026824/
 *
 * Question Link -  https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * Question:
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

class Solution {
        public int longestConsecutive(int[] nums) {
            int longestSequence = Integer.MIN_VALUE;
            HashSet<Integer> set = new HashSet<>();

            if (nums.length == 0) {
                return 0;
            }

            if (nums.length == 1) {
                return 1;
            }

            for (int num: nums) {
                set.add(num);
            }

            for (int num : set) {
                if (!set.contains(num - 1)) {
                    int j = num;
                    while (set.contains(j)) {
                        j++;
                    }
                    longestSequence = Math.max(longestSequence, j - num);
                }
            }
            return longestSequence;
        }
 }
