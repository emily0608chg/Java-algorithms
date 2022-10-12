package practice.book.binarytree;

import java.util.Iterator;
import java.util.Stack;

public class IteratorTreeBinaryImpl <T> implements Iterator<Node<T>> {

    private Stack<Node<T>> pile = new Stack<>();

    public IteratorTreeBinaryImpl (Node<T> root) {
        pile.push(root);
    }

    @Override
    public boolean hasNext() {
        return !pile.isEmpty();
    }

    @Override
    public Node<T> next() {
        Node<T> n = pile.pop();

        if (n.getRight() != null) {
            pile.push(n.getRight());
        }
        if (n.getLeft() != null) {
            pile.push(n.getLeft());
        }
        return n;
    }

    @Override
    public void remove() {
        throw new RuntimeException("This method is not implement");
    }
}
