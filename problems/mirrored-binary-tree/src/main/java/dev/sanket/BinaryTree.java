package dev.sanket;

public class BinaryTree {

    static class Node {

        int data;

        Node left;

        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }

        public static Node create(int data, Node left, Node right) {
            return new Node(data, left, right);
        }
    }

    public static boolean isMirrored(Node root) {

        StringBuilder leftNodes = new StringBuilder();
        StringBuilder rightNodes = new StringBuilder();

        inOrder(root.left, leftNodes);
        reverseInOrder(root.right, rightNodes);

        return leftNodes.toString().equals(rightNodes.toString());
    }

    private static void inOrder(Node node, StringBuilder nodes) {

        if (node.left != null) {
            inOrder(node.left, nodes);
        }

        nodes.append(node.data);

        if (node.right != null) {
            inOrder(node.right, nodes);
        }
    }

    private static void reverseInOrder(Node node, StringBuilder nodes) {

        if (node.right != null) {
            reverseInOrder(node.right, nodes);
        }

        nodes.append(node.data);

        if (node.left != null) {
            reverseInOrder(node.left, nodes);
        }
    }
}