package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.List;

public class MoveElementToEnd {
    // O (N) time, O(1) space
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int leftIndex = 0;
        int rightIndex = array.size() - 1;
        while (leftIndex < rightIndex) {
            if (array.get(rightIndex) == toMove) {
                rightIndex--;
            } else if (array.get(leftIndex) != toMove) {
                leftIndex++;
            } else {
                swap(array, rightIndex, leftIndex);
            }
        }
        return array;
    }

    private static void swap(List<Integer> array, int firstIndex, int secondIndex) {
        int temp = array.get(firstIndex);
        array.set(firstIndex, array.get(secondIndex));
        array.set(secondIndex, temp);
    }

//    public static void main(String[] args) {
//        List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
//        int toMove = 2;
//        System.out.print(moveElementToEnd(array, toMove));
//    }

}
