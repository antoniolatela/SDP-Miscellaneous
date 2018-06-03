package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTest<K, V> {
    K k;
    V v;

    List<Node> l = new ArrayList();

    class Node<K, V> {
        K k;
        V v;

        public Node(K k, V v) {
            if (k == null) throw new IllegalArgumentException("Key can't be null.");
            this.k = k;
            this.v = v;
        }
    }

    void add(K k, V v) {
        this.k = k;
        this.v = v;
        l.add(new Node(k, v));
    }

    Iterator<Node> values() {
        return l.iterator();
    }

    public static void main(String[] args) {

        GenericsTest<Integer, String> gt = new GenericsTest<>();
        gt.add(1, "ciao");
        gt.add(2, "come");
        gt.add(3, "stai");
        gt.add(4, "tu?");

        Iterator<GenericsTest.Node> i = gt.values();

        while (i.hasNext()) {
            GenericsTest.Node n = i.next();
            System.out.println(n.k + " " + n.v);
        }

    }
}
