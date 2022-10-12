package codesignal_hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AddBorder {

    public static String[] addBorder(String[] picture) {

        String aster = "";

        List<String> edge = new ArrayList<>();

        int lengthPic = picture[0].length();

        for(int i = 0; i < lengthPic + 2; i++) {
            aster = aster + "*";
        }

        for(int i = 0; i < picture.length; i++) {
            picture[i] = "*"+picture[i]+"*";
        }

        edge.add(aster);

        for(int i = 0; i < picture.length; i++) {
            edge.add(picture[i]);
        }

        edge.add(aster);

        String[] result = edge.toArray(new String[edge.size()]);

        for (String e: result)
        {
            System.out.println(e);
        }
        return result;
    }

    public static void main(String[] args) {
        String [] picture = {"abc",
                "ded"};

        addBorder(picture);
    }
}
