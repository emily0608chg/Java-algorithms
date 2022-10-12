package codesignal_hackerrank;

import java.util.ArrayList;

public class ArrayLongestStrings {

    public static String [] allLongestStrings(String [] inputArray){
        int maxLength = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (maxLength < inputArray[i].length())
                maxLength = inputArray[i].length();
        }

        int longest = maxLength;

        ArrayList<String> newArr = new ArrayList<String>();
        for (int j = 0; j < inputArray.length; j++) {
            if (longest == inputArray[j].length()) {
                newArr.add(inputArray[j]);
            }
        }
        System.out.println(newArr);
        return newArr.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String [] array = {"acd", "aaa","def","ee","xfs","a"};

        allLongestStrings(array);
    }
}
