package datastructure.LinkedList;

public class DoublyEndedLinkedList {
    private Node head;
    private Node tail;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
        if (this.count() == 1) this.tail = this.head;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail != null)
            this.tail.setNextNode(newNode);
            this.tail = newNode;

    }

    public int count() {
        int c = 0;
        Node current = this.head;
        while (current != null) {
            c++;
            current = current.getNextNode();
        }
        return c;
    }

    public void deleteHead () {
        this.head = this.head.getNextNode();
    }

    public void deleteTail () {
        if (this.head != null) {
            if (this.count() == 1) {
                deleteHead();
            } else {
                Node n = this.head;
                while (n.getNextNode().getNextNode() != null) {
                    n = n.getNextNode();
                }
                n.setNextNode(null);
                n = this.tail;
            }
        }
    }

    public boolean searchElement(int i) {
        Node n = this.head;
        while (n != null) {
            if (n.getData() == i) {
                return true;
            } else {
                n = n.getNextNode();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current!=null) {
            result += current.toString() + (current.getNextNode() != null ? "," : "");
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
