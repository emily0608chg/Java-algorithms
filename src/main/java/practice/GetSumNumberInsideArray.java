package practice;

public class GetSumNumberInsideArray {

    public static boolean getEqualNumber(int [] array ,int tar) {
        for (int index = 0; index < array.length; index++) {
            int first = array[index];
            for (int next = index + 1; next < array.length; next++) {
                int second = array[next];
                if (first + second == tar) {
                    System.out.println("we found the sum of " +first+ " + "+ second +  " is equal to target " + tar);
                    return true;

                }
            }
        }
        System.out.println("The sum of the numbers is not equal to " + tar);
        return false;
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 7, 9};
        int target = 7;
        getEqualNumber( array , target);
    }
}

