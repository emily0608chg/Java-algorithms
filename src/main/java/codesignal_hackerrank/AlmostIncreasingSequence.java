package codesignal_hackerrank;

public class AlmostIncreasingSequence {

    public static boolean almostIncreasingSequence(int[] sequence) {
        int numOfChanges = 0;
        int i, j;
        for (i = 0; i < (sequence.length - 1); i++) {
            if (sequence[i] >= sequence[i + 1]) {
                numOfChanges++;
                for (j = i + 1; j < (sequence.length - 1); j++) {
                    if (sequence[i] == sequence[j] || i > 0 && i + 2 < sequence.length && sequence[i] >= sequence[i + 2]
                            && sequence[i - 1] >= sequence[i + 1]) {
                        numOfChanges++;
                    }
                }
            }
        }
        if (numOfChanges > 1) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    public static void main(String[] args) {
        int [] array = {2, 2, 2};
        almostIncreasingSequence(array);
    }
}
