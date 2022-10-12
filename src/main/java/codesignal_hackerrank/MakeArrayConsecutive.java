package codesignal_hackerrank;

public class MakeArrayConsecutive {

    public static int makeArrayConsecutive2(int[] statues) {
        int max = statues[0];
        int min = statues[0];
        int elems = (statues.length - 1);
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] > max) {
                max = statues[i];
            }
            if (statues[i] < min) {
                min = statues[i];
            }
        }
        int result = (max - min) - elems;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        int [] sta = {3,4,6};

        makeArrayConsecutive2(sta);
    }

}
