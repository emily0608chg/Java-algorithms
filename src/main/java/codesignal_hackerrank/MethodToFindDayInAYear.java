package codesignal_hackerrank;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MethodToFindDayInAYear {


    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        cal.set(year, month-1, day);

        String result = sdf.format(cal.getTime()).toUpperCase();
        System.out.println(result);

        return result;

    }

    public static void main(String[] args) {
        findDay(12,24,1988);
    }
}
