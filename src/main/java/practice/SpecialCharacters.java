package practice;

import java.io.IOException;
import java.util.Locale;

public class SpecialCharacters {

    public static void countingNumAlphaSpecialChar(String str) {

        int Alphabets = 0, num = 0, space = 0, Special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') { //Check Alphabets
                Alphabets++;
            } else if (ch >= '0' && ch <= '9') { //Check numeric characters
                num++;
            } else if (ch == ' ') { //check space
                space++;
            } else {   //find the special caracters
                Special++;
            }
        }
        System.out.println("Alphabet letters: " + Alphabets);
        System.out.println("Number: " + num);
        System.out.println("Space: " + space);
        System.out.println("Special characters: " + Special);
    }



        public static void main(String[] args) throws IOException {
            String word = "Hoola que^^ 123 tal";
            System.out.println("Alphabet: " + word.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "").length());
            System.out.println("Numbers: " + word.toLowerCase(Locale.ROOT).replaceAll("[^0-9]", "").length());
            System.out.println("Spaces: " + word.toLowerCase(Locale.ROOT).replaceAll("[^ ]", "").length());

            countingNumAlphaSpecialChar("Hoola que^^ 123 tal");
        }


}