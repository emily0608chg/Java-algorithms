package practice;

import java.util.Hashtable;

public class Fibonacci {

    private static double fibonacci(int x, Hashtable<Integer, Double> t) {
        Double d = t.get(x);

        if (d == null) {
            d = fibonacci(x - 1, t) + fibonacci(x - 2, t);
            t.put(x, d);
        }
        return d;
    }


    public static void main(String args[]) {

        int n1 = 0, n2 = 1, n3, i, count = 5;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        Hashtable<Integer, Double> t = new Hashtable<Integer, Double>();
        t.put(1, 1d); // 1d => 1 convertido a double
        t.put(2, 1d); // 1d => 1 convertido a double

        int n = 10;

        for (int j = 1; j <= n; j++) {
            int f = (int) fibonacci(j, t);
            System.out.println("fib(" + j + ") = " + f);
        }

        }


}


