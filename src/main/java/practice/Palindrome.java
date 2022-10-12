package practice;

public class Palindrome {

    public static void palindromeWord(String word) {

        int ini = 0;
        int des = word.length() - 1;
        boolean error = false;

        while (ini < des && !error) {
            if (word.charAt(ini) == (word.charAt(des))) {
                ini++;
                des--;
            } else {
                error = true;
            }
        }
        if(!error){
            System.out.println(word + " This word is PALINDROME");
        }else {
            System.out.println(word + " this word is not a PALINDROME");
        }

    }


    public static boolean solution(String inputString) {

        String reversedString = new StringBuffer(inputString).reverse().toString();
        if (inputString.equals(reversedString)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean palindromeRearranging(String inputString) {
        int[] niz = new int[10];

        for(int i=0; i<inputString.length(); i++){
            niz[inputString.charAt(i)-'a']++;
        }

        int cnt=0;
        for(int i=0; i<niz.length; i++){
            if(niz[i]%2!=0){
                cnt++;
            }
        }
        System.out.println(cnt<=1);
        return cnt<=1;
    }



    public static void main(String[] args) {


       String word = "abcba";

       palindromeWord(word);

        solution(word);

        palindromeRearranging(word);

    }
}
