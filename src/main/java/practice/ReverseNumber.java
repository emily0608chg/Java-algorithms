package practice;

public class ReverseNumber {

    public static int reverseNumber(int num) {
        int reversed = 0;

        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        return reversed;
    }

    public static void main(String[] args) {
        reverseNumber(2343);

    }
}
