package datastructure.BinaryTree;

import datastructure.Queue.Queue;
import datastructure.Stack.Stack;

import java.util.Arrays;
import java.util.List;

public class Node<T extends Comparable<T>> {

    T data;
    Node leftChild;
    Node rightChild;

    public Node(T data) {
        this.data = data;
    }

    public Node find(T data) {
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
            } else
                this.rightChild.insert(data);
        } else {
            if (this.leftChild == null) {
                System.out.println("insert to l " + data);
                this.leftChild = new Node(data);
            } else
                this.leftChild.insert(data);
        }
    }

    public Node findIterativeMin() {
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
        int i = Math.max(findWeight(n.getLeftChild()), findWeight(n.getRightChild())) + 1;
        System.out.println("Max: l-> " + n.getLeftChild() + "Data: " + n.getData() + " r-> " + n.getRightChild() + " i: " + i);

        return i;
    }

    public int findHeigt(Node n) {
        if (n == null) return -1;
        System.out.println("Max: l-> " + n.getLeftChild() + "Data: " + n.getData() + " r-> " + n.getRightChild());
        return Math.max(findHeigt(n.getLeftChild()), findHeigt(n.getRightChild())) + 1;
    }

    public Node findRecursiveMax(Node n) {
        if (n.getRightChild() != null) return findRecursiveMax(n.getRightChild());
        else return n;
    }

    public Node findRecursiveMin(Node n) {
        if (n.getRightChild() != null) return findRecursiveMin(n.getRightChild());
        else return n;
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

    public void preOrderTraversal(Node n) {
        if (n != null) {
            System.out.println(n.getData());
        }
        if (n.getLeftChild() != null) {
            preOrderTraversal(n.getLeftChild());
        }
        if (n.getRightChild() != null) {
            preOrderTraversal(n.getRightChild());
        }
    }

    public void inOrderIterativeTraversal(Node n) {
        Stack<Node> stack = new Stack<>();
        if (n == null) return;
        else {
            stack.push(n);
            while (true) {
                if (n.getLeftChild() != null) {
                    n = n.getLeftChild();
                    stack.push(n);
                } else {
                    if (stack.peek() == null) break;
                    else n = stack.pop();
                    System.out.println(n.getData());
                    if (n.getRightChild() != null) {
                        n = n.getRightChild();
                        stack.push(n);
                    }
                }
            }
        }
    }

    public void preOrderIterativeTraversal(Node n) {
        Stack<Node> stack = new Stack<>();
        while (true) {

            if (n != null) {
                stack.push(n);
                System.out.println(n);
                n = n.getLeftChild();
            } else {
                if (stack.peek() == null) break;
                n = stack.pop().getRightChild();
            }
            System.out.println(stack);

        }
    }


    public void postOrderTraversal(Node n) {
        if (n.getLeftChild() != null) {
            postOrderTraversal(n.getLeftChild());
        }
        if (n.getRightChild() != null) {
            postOrderTraversal(n.getRightChild());
        }
        if (n != null) {
            System.out.println(n.getData());
        }
    }

    public void inOrderTraversal(Node n) {
        if (n.getLeftChild() != null) {
            inOrderTraversal(n.getLeftChild());
        }
        if (n != null) {
            System.out.println(n.getData());
        }
        if (n.getRightChild() != null) {
            inOrderTraversal(n.getRightChild());
        }

    }

    boolean isBST(Node n) {
        if (n == null) throw new IndexOutOfBoundsException("Empty tree!");
        if (n.getLeftChild() != null) {
            if (n.getLeftChild().getData().compareTo(n.getData()) < 0) {

                isBST(n.getLeftChild());
            } else return false;
        }
        if (n.getRightChild() != null) {
            if (n.getRightChild().getData().compareTo(n.getData()) > 0) {

                isBST(n.getRightChild());
            } else return false;
        }
        return true;
    }


    public void deleteNode(T data) {
        Node node = find(data);
        System.out.println(node);
        if (node != null && node.getLeftChild() == null && node.getRightChild() == null) {
            node = null;
        }
        System.out.println(node);
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

    @Override
    public String toString() {
        return this.getData().toString();
    }
}
