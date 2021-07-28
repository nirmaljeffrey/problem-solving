package dev.nirmaljeffrey.problemsolving.algoexpert.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

   // O(N) time, N -> size of competitions array or results array
  //  0(K) space, K -> no of teams
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        HashMap<String,Integer> winnerMap = new HashMap<>();

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 0) {
                update(winnerMap, competitions.get(i).get(1));
            } else {
                update(winnerMap, competitions.get(i).get(0));
            }
        }

        int winnerPoints = Integer.MIN_VALUE;
        String winner = "";

        for (Map.Entry<String, Integer> entry : winnerMap.entrySet()) {
            if (winnerPoints < entry.getValue()) {
                winnerPoints = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }

    private static void update(HashMap<String, Integer> map, String team) {
        if (map.containsKey(team)) {
            map.put(team, map.get(team) + 3);
        } else {
            map.put(team, 3);
        }
    }

//    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
//        competitions.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
//        competitions.add(new ArrayList<>(Arrays.asList("C#", "Python")));
//        competitions.add(new ArrayList<>(Arrays.asList("Python", "HTML")));
//
//       ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
//       System.out.print(tournamentWinner(competitions, results));
//
//    }


}
