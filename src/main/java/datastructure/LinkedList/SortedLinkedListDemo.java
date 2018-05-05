package datastructure.LinkedList;

public class SortedLinkedListDemo {
    public static void main(String[] args) {
        SortedLinkedList sll = new SortedLinkedList();
        sll.insertNode(4);
        sll.insertNode(50);
        sll.insertNode(5);
        sll.insertNode(500);

        sll.insertNode(30);
        sll.insertNode(60);
        sll.insertNode(70);
        sll.insertNode(-1);
        sll.insertNode(501);

        System.out.println(sll);
    }
}
