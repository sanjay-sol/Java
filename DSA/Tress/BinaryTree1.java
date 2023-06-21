package DSA.Tress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

    }

    public static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

            }

        }

    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = countNodes(root.left);
        int rightnodes = countNodes(root.right);
        return leftnodes + rightnodes + 1;

    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = sumOfNodes(root.left);
        int rightnodes = sumOfNodes(root.right);
        return leftnodes + rightnodes + root.data;// only root.data will be change.....

    }

    public static int heightOf(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightOf(root.left);
        return lh;
        // return 1+Math.max(heightOf(root.left),heightOf(root.right) );

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = height(root.left);
        int rightnodes = height(root.right);
        int totalheight = Math.max(leftnodes, rightnodes) + 1;
        return totalheight;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        // int nodes[] = {1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1 };
        int nodes[] = { 10, 20, -1, -1, 30, 40, 50, -1, -1, -1, 60, -1, 70, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(heightOf(root));
        // System.out.println(root.data);
        // System.out.println("PreOrder");
        // preorder(root);
        // System.out.println();
        // System.out.println("InOrder");
        // inorder(root);
        // System.out.println();
        // System.out.println("POstOrder");
        // postorder(root);
        // System.out.println();
        System.out.println("Level Order");
        LevelOrder(root);
        // System.out.println("Count Nodes");
        // // countNodes(root);
        // System.out.println(countNodes(root));
        // System.out.println("Sum of Nodes are : ");
        // System.out.println(sumOfNodes(root));
        System.out.println("Height of tree : ");
        System.out.println(height(root));

    }
}
