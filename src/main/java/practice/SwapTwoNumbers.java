package practice;

import java.util.Arrays;


public class SwapTwoNumbers {


    public static void main(String[] args ) {

            int x = 32;
            int y = 14;
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swaping:"
                    + " x = " + x + ", y = " + y);

            String word = "how are you Diego";

            String[] lastWord = word.split(" ");


            String diego = lastWord[3];
            System.out.println("lastWord = " + diego);

            String sWord = word.substring(word.lastIndexOf(32) + 1);
            System.out.println("sWord = " + sWord);

            System.out.println(" ---------------------------- " );

            String nicoWord = "abcabcaasdfweasdfweasdfwea";

            String[] anotherW = nicoWord.split("aa");
            String [] otherPart = nicoWord.split("ca");
            String[] onlyA = nicoWord.split("c");

            String firstPart = anotherW[0];
            String thirdPart = otherPart[2];
            String onlyAA= onlyA[2];
            String [] lastA = onlyAA.split("as");
            String justA = lastA[0];

            System.out.println("Fist Part = " + "2" + "["+firstPart+"]");
            System.out.println("only a = " + "1"+  "["+justA+"]");
            System.out.println("Third Part = "+ "3" + "["+thirdPart+"]");




        }

    }








