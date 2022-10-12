package practice.book.binarytree;

import java.util.Comparator;

public class Abb<T> {

    private Node<T> root = null;

    private Comparator<T> comp = null;

    public Abb(Comparator<T> c) {
        this.comp = c;
    }

    public Node<T> getRoot() {
        return root;
    }

    public Node<T> search(T v) {
        Node<T> aux = root;

        while (aux != null && comp.compare(v, aux.getV()) != 0) {

            if (comp.compare(v, aux.getV()) < 0) {

                aux = aux.getRight();
            } else {
                if (comp.compare(v, aux.getV()) > 0) {
                    aux = aux.getLeft();
                }
            }
        }
        return aux;
    }


    public void add(T v) {
        Node<T> newSon = new Node<T>(v);

        if (root == null) {
            root = newSon;
            return;
        }

        Node<T> aux = root;

        Node<T> father = null;

        while (aux != null) {
            father = aux;

            if (comp.compare(v, father.getV()) < 0) {
                aux = aux.getRight();
            } else {
                aux = aux.getLeft();
            }
        }

        if (comp.compare(v, father.getV()) < 0) {
            father.setLeft(new Node<>(v));
        } else {
            father.setRight(new Node<>(v));
        }
    }

}
