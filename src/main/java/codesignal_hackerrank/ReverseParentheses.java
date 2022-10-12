package codesignal_hackerrank;

public class ReverseParentheses {

   public static String reverseParentheses(String s) {
        int firstIndex = 0, secondIndex = 0;

        while (s.contains("(")){

            s = s.replace("("+s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))+")",
                    new StringBuffer(s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))).reverse().toString());
        }
       System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String word = "foo(bar)baz";

        reverseParentheses(word);
    }
}
