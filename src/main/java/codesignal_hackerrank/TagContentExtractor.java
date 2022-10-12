package codesignal_hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    /*<4
    h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
    <Amee>safat codes like a ninja</amee>
    <SA premium>Imtiaz has a secret crush</SA premium>*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a block of HTML code");
        int testCases = Integer.parseInt(in.nextLine());


        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";

            int count = 0;

            Pattern p = Pattern.compile(pattern);
            Matcher m =  p.matcher(line);

            while(m.find())
            {
                System.out.println(m.group(2));
                count++;
            }
            if(count == 0){
                System.out.println("None");
            }
            testCases--;
        }
    }

}
