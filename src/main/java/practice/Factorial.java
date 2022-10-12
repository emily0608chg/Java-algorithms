package practice;

public class Factorial {

    private static long factorial_(int x)
    {
        long ret;

        if( x==0 )
        {
            ret = 1;
        }
        else
        {
            ret = x*factorial_(x-1);
        }

        return ret;
    }
    // factorial of 4 = 1 * 2 * 3 * 4 = 24
    public static void factorial(int n) {
        long proctorial = 1;
        int i = 1;
        do {
            proctorial *= i;
            i++;
        } while (i <= n);
        System.out.println(proctorial);
    }

    public static void main(String[] args) {
        
        int n = 5;
        long f = factorial_(n);

        System.out.println("f = " + f);
        factorial(4);
    }
}
