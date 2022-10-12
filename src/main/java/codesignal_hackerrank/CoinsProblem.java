package codesignal_hackerrank;

import java.util.*;

public class CoinsProblem {

    public static HashMap<String, Integer> menu = new HashMap<>();
    public static final int MINIMUM_VALUE = 100;

    public static void printAllCombinations() {
        HashSet<List<String>> solutionSet = new HashSet<>();
        int coins = 400;
        //HashMap<Integer, List<List<String>>> hashmap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            List<String> firstStep = new ArrayList<>();
            firstStep.add(entry.getKey());
            availableCombination(coins - entry.getValue(), firstStep, solutionSet);
        }

        System.out.println(solutionSet);
    }

    public static void availableCombination(
            int coins,
            List<String> currentBranch,
            HashSet<List<String>> solutionSet) {
        if (coins < MINIMUM_VALUE) {
            solutionSet.add(currentBranch);
        } else {
            for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                if (coins >= entry.getValue()) {
                    List<String> auxList = new LinkedList<>(currentBranch);
                    auxList.add(entry.getKey());
                    availableCombination(coins - entry.getValue(), auxList, solutionSet);
                }
            }
        }
    }

    public static void main(String[] args) {
        menu.put("coffee", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 225);

        printAllCombinations();
    }
}
