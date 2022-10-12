package codesignal_hackerrank;

public class CenturyYear {


    static int centuryYear(int year) {
        int result = 0;
        // No negative value is allow for year
        if (year <= 0){
            System.out.println("0 and negative is not allow") ;
        }
        else if (year % 100 == 0){
            result = year/ 100 ;
            System.out.println( result);
        }else{
            result = year/ 100 + 1;
            System.out.println(result);
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        int y = 1990;

        centuryYear(y);
    }
}
