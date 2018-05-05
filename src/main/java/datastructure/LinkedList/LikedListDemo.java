package datastructure.LinkedList;

public class LikedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(1);
        list.deleteHead();
        System.out.println(list.length());
    }
}
