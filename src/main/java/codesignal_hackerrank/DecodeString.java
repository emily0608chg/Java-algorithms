package codesignal_hackerrank;

import java.util.Arrays;
import java.util.Iterator;

public class DecodeString {

    public static void main(String[] args){
        System.out.println(getDecodedString("2[abc]2[cda]1[a]"));
        System.out.println(getDecodedString("3[asdf]"));
        System.out.println(getDecodedString("3[a]4[b]"));
    }

    public static String getDecodedString(String encoded){
        String[] elements = encoded.split("[\\[\\]]");
        String result = "";
        Iterator<String> iterator = Arrays.stream(elements).iterator();
        while (iterator.hasNext()){
            int number = Integer.parseInt(iterator.next());
            result+=iterator.next().repeat(number);
        }
        return result;
    }
}
