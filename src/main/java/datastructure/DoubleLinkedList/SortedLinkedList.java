package datastructure.DoubleLinkedList;

public class SortedLinkedList {
    private Node head;

    public void insertNode(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            Node n = this.head;
            if (data <= this.head.getData()) {
                newNode.setNextNode(this.head);
                this.head.setPreviousNode(newNode);
                this.head = newNode;
            } else {
                while (data > n.getData() && (n.getNextNode() != null && n.getNextNode().getData()<data)) {
                    n = n.getNextNode();
                }
                newNode.setPreviousNode(n);
                newNode.setNextNode(n.getNextNode());
                if (n.getNextNode()!= null) n.getNextNode().setPreviousNode(newNode);
                n.setNextNode(newNode);
            }
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

    public void deleteHead() {
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

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
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


