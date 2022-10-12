package practice;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println("Reversed string: " + reverse("Solvd"));
        System.out.println( reverseWordJava("Emily"));
        System.out.println(reverseWord("Dafne "));
    }

    public static String reverse(String input){

        char[] stringArray = input.toCharArray();
        char[] reversedString = new char[input.length()];

        int adder = 0;
        for(int index = input.length() -1; index>=0; index--){
            reversedString[index] = stringArray[adder];
            adder ++;
        }

        return new String(reversedString);
    }

    public static String reverseWordJava(String word) {
        System.out.println(word + " <-- in reverse -->");
        char[] ch = word.toCharArray();
        int begin = 0;
        int end = ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
            begin++;
        }
        word = new String(ch);
        return word;
    }

    // Reverse a word with StringBuilder
    public static  String reverseWord(String word) {
        System.out.println(word + " <-- in reverse -->");
        StringBuilder stringBuilder = new StringBuilder(word);
        word = stringBuilder.reverse().toString();
        return word;
    }

}

