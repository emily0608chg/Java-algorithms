package practice.book.binarytree;

import java.util.Comparator;

public class CompInteger  implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
