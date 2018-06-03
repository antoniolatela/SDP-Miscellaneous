package collectionsTest;

import datastructure.BinaryTree.BinarySearchTree;

import java.util.*;
import java.util.function.Consumer;

public class CollectionTest <T extends Comparable<T>>{
    List<some> c = new ArrayList<>();
    Collection<String> c1 = new HashSet<>();
    Consumer<some> c3 = (i) -> i.name = i.name + "_";
    LinkedList<String> ll = new LinkedList<>();
    BinarySearchTree bst = new BinarySearchTree();
    TreeSet<Integer> ts = new TreeSet();
    Queue q = new PriorityQueue();


    void test() {
        c.add(new some("Antonio"));
        List l = Collections.unmodifiableList(c);
        l.forEach(a-> System.out.println(((some)a).name));
        ((some)l.get(0)).name = "pluto";
        l.forEach(b-> System.out.println(((some)b).name));
        c.add(null);
        c.forEach(b-> System.out.println(b));
        c.removeAll(Collections.singleton(null));
        c.forEach(b-> System.out.println(b));
        List l2 = Arrays.asList(new String [] {"ciao"});
        l2.forEach(a-> System.out.println(a));

        String s1[]={"dj"};
        Set<String> s = Set.of(s1);

        System.out.println(s.toArray()[0]);
    }

    class some{
        public String name;
        public String surname;
        public some(String name){
            this.name = name;
        }
        void comp() {
            name.compareTo(surname);
        }
    }





    public static void main(String[] args) {

        CollectionTest c = new CollectionTest();
        c.test();

    }
}
