package practice.book.binarytree;

public class Node <T> {

    private T v = null;

    private Node<T> right = null;
    private Node<T> left = null;

    public Node(T v) {
        this.v = v;
    }

    public T getV() {
        return v;
    }

    public void setV(T v) {
        this.v = v;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }
}
