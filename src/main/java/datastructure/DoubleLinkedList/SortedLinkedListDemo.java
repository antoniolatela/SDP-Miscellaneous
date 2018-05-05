package datastructure.DoubleLinkedList;

public class SortedLinkedListDemo {
    public static void main(String[] args) {
        SortedLinkedList sll = new SortedLinkedList();

        for (int i = 0; i < 10000; i++) {
            sll.insertNode(new java.util.Random().nextInt(10000));
        }
        System.out.println("-");
        System.out.println(sll);
    }
}
