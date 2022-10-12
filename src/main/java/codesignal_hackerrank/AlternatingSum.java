package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AlternatingSum {

    public static int[] alternatingSums(int[] a) {
        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();
        int teamAsum = 0;
        int teamBsum = 0;

        for(int i = 0; i < a.length; i++ ) {
            if(i % 2 == 0) {
                teamA.add(a[i]);
            } else {
                teamB.add(a[i]);
            }
        }

        for(int i = 0; i < teamA.size(); i++) {
            teamAsum = teamAsum + teamA.get(i);
        }

        for(int i = 0; i < teamB.size(); i++) {
            teamBsum = teamBsum + teamB.get(i);
        }

        int[] result = {teamAsum, teamBsum};

        for (Integer e: result
             ) {
            System.out.println(e);

        }
        return result;

    }

    public static void main(String[] args) {
        int [] a = {50, 50, 10, 45, 70};

        alternatingSums(a);
    }

}
