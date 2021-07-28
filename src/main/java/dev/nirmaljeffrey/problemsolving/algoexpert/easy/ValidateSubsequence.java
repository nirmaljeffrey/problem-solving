package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

import java.util.List;


class ValidateSubsequence {
    // O(N) time | O (1) space solution
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        int arrayIndex = 0;

        while (sequenceIndex < sequence.size() && arrayIndex < array.size()) {
            if (sequence.get(sequenceIndex).equals(array.get(arrayIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        return sequenceIndex == sequence.size();
    }
}