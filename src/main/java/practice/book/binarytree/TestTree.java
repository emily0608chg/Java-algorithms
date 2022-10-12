package practice.book.binarytree;

import java.util.Iterator;

public class TestTree {

    private static Node<Integer> createTree(){

        // 3rt level
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n0 = new Node<>(0);
        Node<Integer> n7 = new Node<>(7);
        // 2nd level
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n4 = new Node<>(4);
        n4.setRight(n8);
        n4.setLeft(n3);
        Node<Integer> n9 = new Node<>(9);
        n9.setRight(n0);
        n9.setLeft(n7);
        //1st level
        Node<Integer> n2 = new Node<>(2);
        n2.setRight(n1);
        n2.setLeft(n4);
        Node<Integer> n6 = new Node<>(6);
        n6.setLeft(n9);
        // 0 Level
        Node<Integer> n5 = new Node<>(5);
        n5.setRight(n2);
        n5.setLeft(n6);
        return n5;
    }

    public static void main(String[] args) {

        ProcessPrintImplementation<Number> impSum = new ProcessPrintImplementation<Number>();

        Node<Integer> root = createTree();

        Iterator<Node<Integer>> it = UTree.createIterator(root);

        while (it.hasNext()){
            Node<Integer> n = it.next();

            System.out.println(n.getV());
        }

        UTree.amplitude(root, impSum);

        System.out.println("the sum is:" + impSum.getSum());

        System.out.println("-----------------------Abb---------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        Abb<Integer> abb = new Abb<Integer>(new CompInteger());
        // recordemos el contenido del conjunto A
        // A = {5, 2, 8, 1, 9, 7, 3, 4, 10, 6}
        abb.add(5);
        abb.add(2);
        abb.add(8);
        abb.add(1);
        abb.add(9);
        abb.add(7);
        abb.add(3);
        abb.add(4);
        abb.add(10);
        abb.add(6);


        UTree.inOrder(abb.getRoot(), new ProcessPrintImplementation<Integer>());

    }

}
