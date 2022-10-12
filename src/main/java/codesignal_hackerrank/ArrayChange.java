package codesignal_hackerrank;

public class ArrayChange {

    /*You are given an array of integers.
    On each move you are allowed to increase exactly one of its element by one.
    Find the minimal number of moves required to obtain a strictly increasing sequence from the input.*/

   public static int arrayChange(int[] inputArray) {

        int resultSum = 0;

        for(int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i] >= inputArray[i+1]) {
                resultSum = resultSum + ((inputArray[i]-inputArray[i+1])+1);
                inputArray[i+1] = inputArray[i+1] + ((inputArray[i]-inputArray[i+1])+1);
            }

        }
       System.out.println(resultSum);
        return resultSum;
    }

    public static void main(String[] args) {

       int [] inputArray = {1, 1, 1};
       arrayChange(inputArray);
    }
}
