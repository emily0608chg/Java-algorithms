package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.List;

public class IsPv4Address {



    static boolean solution(String inputString) {

        int increase = 0;
        String temp = "";
        List<String> ip4 = new ArrayList<>();
        List<Integer> iip4 = new ArrayList<>();
        for(int i = 0; i<inputString.length();i++) {
            if (inputString.charAt(i) == '.') {
                increase++;
                ip4.add(temp);
                temp = "";
            }else
                temp += inputString.charAt(i);

            if (i == inputString.length()-1) {
                ip4.add(temp);
            }
        }

        for(String ip : ip4) {
            if (ip == null || ip.equals("")) {
                System.out.println("false");
                return false;
            }

            if (ip.length() >= 2 && ip.charAt(0) == '0'){
                System.out.println("false");
                return false;
            }
            for(char c : ip.toCharArray()) {
                int t = c - '0';
                if (t <  0 || 9 < t) {
                    System.out.println("false");
                    return false;
                }
            }
            if (ip.length() > 3){
                System.out.println("false");
                return false;
            }
            iip4.add(Integer.valueOf(ip));

        }

        for(int ip : iip4) {
            if ( ip < 0  || 255 < ip )
                System.out.println("false");
                return false;
        }

        if (increase != 3) {
            System.out.println("false");
            return false;
        }else{
            System.out.println("true");
            return true;
        }

    }




    public static void main(String[] args) {
        String inputString = "172.16.254.1";

        solution(inputString);
    }

}
