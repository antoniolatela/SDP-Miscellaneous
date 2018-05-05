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

    public void preOrderTraversal() {
        rootNode.preOrderTraversal(rootNode);
    }

    public void postOrderTraversal() {
        rootNode.postOrderTraversal(rootNode);
    }

    public void inOrderTraversal() {
        rootNode.inOrderTraversal(rootNode);
    }

    public boolean isBST () {
        return rootNode.isBST(rootNode);
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
        bt.insertNode(8);
        bt.insertNode(7);
        bt.insertNode(13);
        bt.insertNode(4);
        bt.insertNode(5);

        bt.insertNode(12);
        bt.insertNode(15);
        bt.insertNode(150);
        bt.insertNode(105);
        bt.insertNode(115);
        bt.insertNode(151);
        bt.insertNode(515);
        bt.insertNode(1500);
        bt.insertNode(1115);
        bt.insertNode(145);


        bt.levelOrderVisiting();
        System.out.println();
        bt.preOrderTraversal();
        System.out.println();
        bt.postOrderTraversal();
        System.out.println();
        bt.inOrderTraversal();
        System.out.println();
        System.out.println(bt.isBST());
    }
}
