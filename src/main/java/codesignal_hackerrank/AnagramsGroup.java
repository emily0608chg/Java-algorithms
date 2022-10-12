package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.HashMap;

public class AnagramsGroup {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"tea", "Eat", "Ate", "God", "Dog", "dgo", "tree"}));
    }

    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strings) {
        ArrayList<ArrayList<String>> anagrams = new ArrayList<>();
        int size = strings.length;

        for (int i = 0; i < size; i++) {
            if (anagrams.size() <= i) {
                anagrams.add(new ArrayList<String>());
            }
            anagrams.get(anagrams.size() - 1).add(strings[i]);
            for (int j = i + 1; j < size; j++) {
                if (isAnagram(strings[i], strings[j])) {
                    anagrams.get(anagrams.size() - 1).add(strings[j]);
                    i = j;
                }
            }
        }
        return anagrams;
    }

    static boolean isAnagram(String firstWord, String secondWord) {
        int size = firstWord.length();
        if (size != secondWord.length()) {
            return false;
        }

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        HashMap<Character, Integer> occurrences = new HashMap<>();
        int i;
        char charAtIndex;
        for (i = 0; i < size; i++) {
            charAtIndex = firstWord.charAt(i);
            if (occurrences.containsKey(charAtIndex)) {
                occurrences.put(charAtIndex, occurrences.get(charAtIndex) + 1);
            } else {
                occurrences.put(charAtIndex, 1);
            }

            charAtIndex = secondWord.charAt(i);
            if (occurrences.containsKey(charAtIndex)) {
                occurrences.put(charAtIndex, occurrences.get(charAtIndex) - 1);
            } else {
                occurrences.put(charAtIndex, -1);
            }
        }

        for (Character key : occurrences.keySet()) {
            if (occurrences.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
