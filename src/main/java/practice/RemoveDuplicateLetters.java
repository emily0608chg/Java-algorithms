package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {

    // Returns only letters that are not repeated

    public static void getNoRepetitiveLetters(String stringParameter) {
        Map<Character, Integer> letters = new HashMap<>();
        String myString = stringParameter;

        myString.chars().forEach(l -> {
            Character letter = (Character) (char) l;
            Integer lCount = letters.getOrDefault(letter, 0);
            lCount++;
            letters.put(letter, lCount);
        });

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());

            }
        }
    }

    public static void main(String[] args) {
        String in = "Hol jgjffaaaaa";
        String out = in.chars()
                .mapToObj(c -> Character.valueOf((char) c)) // bit messy as chars() returns an IntStream, not a CharStream (which doesn't exist)
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        System.out.println("Java upper 8 "+out );

    getNoRepetitiveLetters("Hol jgjffaaaaa");

    }



}