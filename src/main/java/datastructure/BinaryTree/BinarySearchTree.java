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

    public void inOrderIterativeTraversal() {
        rootNode.inOrderIterativeTraversal(rootNode);
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

    public void preOrderIterativeTraversal() {
        rootNode.preOrderIterativeTraversal(rootNode);
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

    public void deleteNode(T t) {
        rootNode.deleteNode(t);
    }

        public static void main(String[] args) {

        BinarySearchTree<String> bt = new BinarySearchTree();
            bt.insertNode("eval");
            bt.insertNode("asse");
            bt.insertNode("fina");
            bt.insertNode("proj");
            bt.insertNode("impl");
            bt.insertNode("rath");
            bt.insertNode("than");
            bt.insertNode("chro");
            bt.insertNode("acco");
            bt.insertNode("deve");
            bt.insertNode("shou");
            bt.insertNode("desc");
            bt.insertNode("prob");
            bt.insertNode("whic");
            bt.insertNode("addr");
            /*bt.insertNode(5);
            bt.insertNode(3);
            bt.insertNode(9);
            bt.insertNode(2);
            bt.insertNode(4);
            bt.insertNode(7);
            bt.insertNode(10);
            bt.insertNode(6);
            bt.insertNode(8);
            bt.insertNode('a');
            bt.insertNode('b');
            bt.insertNode('c');
            bt.insertNode('d');
            bt.insertNode('e');
            bt.insertNode('f');
            bt.insertNode('g');
            bt.insertNode('h');*/




        //bt.levelOrderVisiting();
        //System.out.println();
        /*bt.preOrderTraversal();
        System.out.println();
        bt.postOrderTraversal();
        System.out.println();
        bt.inOrderTraversal();
        System.out.println();
        System.out.println(bt.isBST());
*/

            //System.out.println();
            //bt.preOrderTraversal();
            //System.out.println();
            //bt.preOrderIterativeTraversal();
            bt.deleteNode("addr");
            System.out.println(bt.find("addr"));
    }
}
