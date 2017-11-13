package dev.sanket.tree;

public class BinaryTree {

    private Node root;

    private BinaryTree(Node root) {
        this.root = root;
    }

    public static BinaryTree fromArray(int[] values) {

        Node root = buildTree(values, 0);

        return new BinaryTree(root);
    }

    private static Node buildTree(int[] values, int nodeIndex) {

        Node node = Node.withValue(values[nodeIndex]);

        if (((nodeIndex * 2) + 2) < values.length) {

            int leftChildIndex = (2 * nodeIndex) + 1;
            int rightChildIndex = (2 * nodeIndex) + 2;

            Node leftChild = buildTree(values, leftChildIndex);
            Node rightChild = buildTree(values, rightChildIndex);

            node.addLeftChild(leftChild);
            node.addRightChild(rightChild);
        }

        return node;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
