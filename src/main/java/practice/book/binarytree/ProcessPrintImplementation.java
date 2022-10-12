package practice.book.binarytree;

public class ProcessPrintImplementation<I extends Number> implements Process<Integer>{

    private int sum = 0;

    @Override
    public void execution(Node<Integer> n) {
        sum+=n.getV();
    }

    public int getSum(){
        return sum;
    }
}
