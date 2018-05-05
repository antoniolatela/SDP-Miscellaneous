package datastructure.LinkedList;

public class DoubledEndedLinkedListDemo {
    public static void main(String[] args) {
        DoublyEndedLinkedList dll = new DoublyEndedLinkedList();
        dll.insertAtTail(1);
        dll.insertAtHead(2);

        System.out.println(dll.count());
        System.out.println(dll);
        dll.deleteTail();
        System.out.println(dll);
    }
}
