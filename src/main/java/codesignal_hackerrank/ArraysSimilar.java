package codesignal_hackerrank;

import java.util.Arrays;

public class ArraysSimilar {

    public static boolean areSimilar(int[] a, int[] b) {

        int cnt = 0;
        boolean result = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                cnt++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            if(cnt <= 2) {
                System.out.println("true");
                result = true;
            } else {
                System.out.println("false");
                result = false;}
        } else {
            System.out.println("false");
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {2, 1, 3};

        areSimilar(a, b);
    }
}
