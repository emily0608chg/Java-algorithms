package practice.book.binarytree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UTree {

    public static <T> void preOrder(Node<T> root, Process<T> p){
        if (root!=null) {
            p.execution(root);
            preOrder(root.getRight(),p);
            preOrder(root.getLeft(),p);
        }
    }

    public static <T> void postOrder(Node<T> root, Process<T> p){
        if (root!=null) {
            postOrder(root.getRight(),p);
            postOrder(root.getLeft(),p);
            p.execution(root);
        }
    }

    public static <T> void inOrder(Node<T> root, Process<T> p){
        if (root!=null) {
            inOrder(root.getRight(),p);
            inOrder(root.getLeft(),p);
            p.execution(root);
        }
    }

    public static <T>Iterator<Node<T>> createIterator(Node<T> root){
        return new IteratorTreeBinaryImpl<T>(root);
    }

    public static <T> void iterative(Node<T>root, Process<T>p){
        Stack<Node<T>> pile = new Stack<>();
        pile.push(root);

        while (!pile.isEmpty()) {
            Node<T> n = pile.pop();
            p.execution(n);

            if (n.getRight() != null) {
                pile.push(n.getRight());
            }
            if (n.getLeft() != null) {
                pile.push(n.getLeft());
            }
        }
    }

    public static <T> void amplitude(Node<T> root, Process<T> p){
        Queue<Node<T>>cola = new LinkedList<Node<T>>();
        cola.add(root);

        while (!cola.isEmpty()) {
            Node<T> n = cola.poll();
            p.execution(n);

            if (n.getRight() !=null){
                cola.add(n.getRight());
            }
            if (n.getLeft() !=null){
                cola.add(n.getRight());
            }
        }
    }
}
