package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {

    public static int[] sortByHeight(int[] a) {
        List<Integer> humanList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>(a.length);

        for(int i=0; i < a.length; i++) {
            if(a[i] != -1) {
                humanList.add(a[i]);
            } else if(a[i] == -1) {
                indexList.add(i);
            }
        }

        int[] humanTmp = new int[humanList.size()];
        for(int i=0; i < humanList.size(); i++) {
            humanTmp[i] = humanList.get(i);
        }

        Arrays.sort(humanTmp);

        for(int i=0; i < humanTmp.length; i++) {
            resultList.add(humanTmp[i]);
        }

        for(int i = 0; i < indexList.size(); i++) {
            resultList.add(indexList.get(i), -1);
        }

        Integer[] resultArrayInteger = resultList.toArray(new Integer[resultList.size()]);
        int[] resultArrayReturn = new int[resultArrayInteger.length];
        for(int i = 0; i < resultArrayInteger.length; i++) {
            resultArrayReturn[i] = resultArrayInteger[i].intValue();
        }

        for (Integer e: resultArrayInteger
             ) {
            System.out.print(e + " ");
        }
        return resultArrayReturn;
    }

    public static void main(String[] args) {
        int [] n = { -1 , 170, 120, 70, -1, -1};

       sortByHeight(n);
    }
}

