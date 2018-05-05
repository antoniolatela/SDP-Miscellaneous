package datastructure.DoubleLinkedList;

public class LinkedList {
    private Node head;
    public static int a = 0;
    public void insertAtHead(int data) {
        if (head == null) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
        } else {
            Node newNode = new Node(data);
            this.head.setPreviousNode(newNode);
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public int length() {
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

    public void orderLinkedList() {
        Node n = this.head;
            while (n.getNextNode() != null && n.getNextNode().getData()<=n.getData()) {

                while (n.getNextNode() != null && n.getNextNode().getData()<=n.getData()) {
                    Node b = n.getNextNode();
                    Node c = n.getPreviousNode();

                    b.setPreviousNode(n.getPreviousNode());

                    if (n == this.head) this.head = b;
                    if (n.getNextNode().getNextNode() != null) n.getNextNode().getNextNode().setPreviousNode(n);
                    n.setNextNode(n.getNextNode().getNextNode());
                    n.setPreviousNode(b);
                    b.setNextNode(n);

                    if (b != this.head) {
                        b.setPreviousNode(c);
                        c.setNextNode(b);
                    }
                }
                n = this.head;
                if (n.getNextNode() != null && n.getNextNode().getData()<n.getData()) {
                } else {
                    n = n.getNextNode();
                }


            }


    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current!=null) {
            result += current.getPreviousNode() + "<- ";
            result += current.toString();
            result += " ->" + current.getNextNode();
            result += (current.getNextNode() != null ? "," : "");

            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
