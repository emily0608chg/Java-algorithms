package codesignal_hackerrank;

import java.util.Arrays;
import java.util.Random;

public class RepetitiveNumbersArray {

    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[n-1];
        return j;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,1,4,4,7,2};
        Arrays.sort(arr);
        int length = arr.length;

        length = removeDuplicateElements(arr, length);

        for (int i = 0; i <length ; i++) {
            System.out.println(arr[i]+" ");
        }
        }

}

