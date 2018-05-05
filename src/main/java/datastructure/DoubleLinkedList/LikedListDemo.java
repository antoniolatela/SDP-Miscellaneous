package datastructure.DoubleLinkedList;

public class LikedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(2);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(9);
        list.insertAtHead(1);
        list.insertAtHead(19);



        System.out.println(list);
        list.orderLinkedList();
        System.out.println(list);

    }
}
