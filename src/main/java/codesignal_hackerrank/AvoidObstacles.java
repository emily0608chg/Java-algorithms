package codesignal_hackerrank;

public class AvoidObstacles {

    static int avoidObstacles(int[] inputArray) {

        int length = inputArray.length;
        for (int jumpLength = 1; ; ++jumpLength) {
            boolean isCaught = false;
            for (int i = 0; i < length && isCaught == false; ++i) {
                if (inputArray[i] % jumpLength == 0) {
                    isCaught = true;
                }
            }
            if (isCaught == false) {
                System.out.println(jumpLength);
                return jumpLength;
            }
        }
    }

    public static void main(String[] args) {
        int [] inputArray = {4, 5, 8, 9};

        avoidObstacles(inputArray);
    }

}
