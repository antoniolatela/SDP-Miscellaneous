package datastructure.BinaryTree;

import datastructure.Queue.Queue;

public class Node<T extends Comparable<T>> {

    T data;
    Node leftChild;
    Node rightChild;

    public Node(T data) {
        this.data = data;
    }

    public Node find (T data) {
        if (this.data == data) return this;
        int compare = data.compareTo(this.data);
        if (compare < 0 && this.getLeftChild() != null) {
            return this.getLeftChild().find(data);
        }

        if (compare >= 0 && this.getRightChild() != null) {
            return this.getRightChild().find(data);
        }
        return null;
    }

    public void insert(T data) {
        int compare = data.compareTo(this.data);
        if (compare > 0) {
            if (this.rightChild == null) {
                System.out.println("insert to r " + data);
                this.rightChild = new Node(data);
            }
            else
            this.rightChild.insert(data);
        } else {
            if (this.leftChild == null) {
                System.out.println("insert to l " + data);
                this.leftChild = new Node(data);
            }
            else
                this.leftChild.insert(data);
        }
    }

    public Node findIterativeMin(){
        Node tmp = this;
        while (tmp.getLeftChild() != null) {
            tmp = tmp.getLeftChild();
        }
        return tmp;
    }

    public Node findIterativeMax() {
        Node tmp = this;
        while (tmp.getRightChild() != null) {
            tmp = tmp.getRightChild();
        }
        return tmp;
    }

    public int findWeight(Node n) {
        if (n == null) return 0;
        int i = Math.max(findWeight(n.getLeftChild()), findWeight(n.getRightChild())) +1;
        System.out.println("Max: l-> " + n.getLeftChild() + "Data: " + n.getData() + " r-> " + n.getRightChild() + " i: " + i);

        return i;
    }

    public int findHeigt(Node n) {
        if (n == null) return -1;
        System.out.println("Max: l-> " + n.getLeftChild() + "Data: " + n.getData() + " r-> " + n.getRightChild());
        return Math.max(findHeigt(n.getLeftChild()), findHeigt(n.getRightChild())) +1;
    }

    public Node findRecursiveMax(Node n) {
        if (n.getRightChild() != null) return findRecursiveMax(n.getRightChild()); else return n;
    }

    public Node findRecursiveMin(Node n) {
        if (n.getRightChild() != null) return findRecursiveMin(n.getRightChild()); else return n;
    }

    public void levelOrderVisiting(Node n) {
        Queue<Node> queue = new Queue<>();

        if (n != null) {
            queue.enqueue(n);
            while (queue.peek() != null) {
                n = queue.dequeue();
                System.out.print(n.data + " ");
                if (n.getLeftChild() != null) queue.enqueue(n.getLeftChild());
                if (n.getRightChild() != null) queue.enqueue(n.getRightChild());
            }
        }
    }

    public T getData() {
        return this.data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

}
