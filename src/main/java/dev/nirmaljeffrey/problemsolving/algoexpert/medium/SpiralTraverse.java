package dev.nirmaljeffrey.problemsolving.algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    // O(N) TIME | O(N) space, where N is the total number of elements in the two dimensional array
    public static List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();

        int startRow = 0;
        int startColumn = 0;
        int endRow = array.length - 1;
        int endColumn = array[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int column = startColumn; column <= endColumn; column++) {
                result.add(array[startRow][column]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endColumn]);
            }

            for (int column = endColumn - 1; column >= startColumn; column--) {
                if (startRow == endRow) {
                    break;
                }
                result.add(array[endRow][column]);
            }

            for (int row = endRow - 1; row > startRow; row--) {
                if (startColumn == endColumn) {
                    break;
                }
                result.add(array[row][startColumn]);
            }
            startColumn++;
            endColumn--;
            startRow++;
            endRow--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {
                 {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
               };
      System.out.println(spiralTraverse(array));
    }
}
