import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;
    public Node(int item) {
        val = item;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    Node root;

    void printLevelOrder() {
        Queue<Node> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            Node ele = nodeQueue.poll();
            System.out.println(ele.val);
            if(ele.left != null) {
                nodeQueue.add(ele.left);
            }
            if(ele.right != null) {
                nodeQueue.add(ele.right);
            }
        }
    }
//          10
//       9        8
//    7    6    5    4


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);
        bt.root.left = new Node(9);
        bt.root.right = new Node(8);
        bt.root.left.left = new Node(7);
        bt.root.left.right = new Node(6);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(4);
        bt.printLevelOrder();
    }
}
