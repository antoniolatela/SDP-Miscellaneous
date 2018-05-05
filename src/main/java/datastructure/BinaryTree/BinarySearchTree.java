package datastructure.BinaryTree;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node rootNode;
    T data;
    Node next;

    public void insertNode (T data) {
        if (rootNode == null)
            this.rootNode = new Node(data);
        else rootNode.insert(data);
    }

    public Node find (T data) {
        if (rootNode != null) {
            return rootNode.find(data);
        } else {
            return null;
        }
    }

    public Node findMin() {
        if (rootNode != null) {
            return rootNode.findIterativeMin();
        } else {
            return null;
        }
    }


    public Node findIterativeMax() {
        if (rootNode != null) {
            return rootNode.findIterativeMax();
        } else {
            return null;
        }
    }

    public Node findRecursiveMax() {
        return rootNode.findRecursiveMax(rootNode);
    }

    public Node findRecursiveMin() {
        return rootNode.findRecursiveMin(rootNode);
    }

    public int findHeight() {
        return rootNode.findHeigt(rootNode);
    }

    public int findWeight() {
        return rootNode.findWeight(rootNode);
    }

    public void levelOrderVisiting() {
        rootNode.levelOrderVisiting(rootNode);
    }

    public static void main(String[] args) {

        BinarySearchTree<Integer> bt = new BinarySearchTree();
        bt.insertNode(10);
        bt.insertNode(9);

        bt.insertNode(8);
        bt.insertNode(7);

        bt.insertNode(11);
        bt.insertNode(14);
        bt.insertNode(3);
        bt.insertNode(4);

        bt.levelOrderVisiting();
        System.out.println();

    }
}
