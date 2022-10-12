package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitString {


    static void pureString(String s) {

        String[]a = s.trim().split("[ !,?._'@]+");
        ArrayList<String>listOfStrings =new ArrayList<>(Arrays.asList(a));
        System.out.println(listOfStrings.size());

        for(String str:listOfStrings){
            System.out.println(str);
        }

    }

    public static void main(String[] args) {

        String ar = "He is a very very good boy, isn't he?";
        pureString(ar);

    }

}
