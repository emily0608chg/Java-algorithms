package codesignal_hackerrank;

import java.text.NumberFormat;
import java.util.Scanner;

public class FormatDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat formatUS = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        String us=formatUS.format(payment);
        NumberFormat formatIn = NumberFormat.getCurrencyInstance(new java.util.Locale("en","in"));
        String india=formatIn.format(payment);
        NumberFormat formatChina = NumberFormat.getCurrencyInstance(java.util.Locale.CHINA);
        String china=formatChina.format(payment);
        NumberFormat formatFrance = NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
        String france=formatFrance.format(payment);



        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
