package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMaximalAdjacentDifference {

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int[] minusArray = new int[inputArray.length-1];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < inputArray.length-1; i++) {
            int minus = Math.abs(inputArray[i] - inputArray[i+1]);
            list.add(minus);
        }

        for(int i = 0; i< minusArray.length; i++) {
            minusArray[i] = list.get(i);
        }

        Arrays.sort(minusArray);

        int result = minusArray[minusArray.length-1];

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        int [] inputArray = {2, 1, 8, 2};

        arrayMaximalAdjacentDifference(inputArray);

        //"25[0-5]|2[0-4][0-9|1[0-9][0-9]|[1-9][0-9]|[0-9]"
    }
}
