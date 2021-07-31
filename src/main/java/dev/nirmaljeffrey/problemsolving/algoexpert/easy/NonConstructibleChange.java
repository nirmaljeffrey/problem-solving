package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

import java.util.Arrays;

public class NonConstructibleChange {
     // O(N logN) time | O(1) space
    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int currentChange = 0;
        for (int i = 0;  i < coins.length; i++) {
            int coin = coins[i];
            if (coin > currentChange + 1) {
                return currentChange + 1;
            } else {
                currentChange += coin;
            }
        }
        return currentChange + 1;
    }
//    // sample output is 20
//    public static void main(String[] args) {
//        int[] coins = {5, 7, 1, 1, 2, 3, 22};
//        System.out.println(nonConstructibleChange(coins));
//    }
}
