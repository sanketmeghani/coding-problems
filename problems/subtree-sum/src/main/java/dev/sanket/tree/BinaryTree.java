package dev.sanket.tree;

public class BinaryTree {

    private Node root;

    private BinaryTree(Node root) {
        this.root = root;
    }

    public static BinaryTree fromArray(int[] values) {

        Node root = Node.withValue(values[0]);

        return new BinaryTree(root);
    }
}
