package practice;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {


    static boolean isAnagram(String a, String b) {
        boolean ret= false;

        if (a !=null && b !=null) {
            char[] array1 = a.toLowerCase(Locale.ROOT).replaceAll("[^a-z1-9]", "").toCharArray();
            java.util.Arrays.sort(array1);
            char[] array2 = b.toLowerCase(Locale.ROOT).replaceAll("[^a-z1-9]", "").toCharArray();
            java.util.Arrays.sort(array2);

            if (java.util.Arrays.equals(array1, array2)) {
                ret = true;
                System.out.println("Both words are anagrams");
            }else{
                System.out.println("They are not anagrams");
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        String firstWord = "Bcad162";
        String secondWord = "ABCD162";

        isAnagram(firstWord, secondWord);

    }
}

