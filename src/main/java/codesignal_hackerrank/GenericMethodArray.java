package codesignal_hackerrank;

public class GenericMethodArray {

    public static <E> void printArray(E[] inputArray) {
        // display array elements
        for (E element : inputArray)
            System.out.println(element);
    }
    public static void main(String[] args) {

        Integer[] number = {1,2,3};
        String [] words = {"Hello", "World"};

        printArray(number);
        printArray(words);

    }
}
