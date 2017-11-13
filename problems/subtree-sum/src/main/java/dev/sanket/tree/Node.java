package dev.sanket.tree;

public class Node {

    private int value;

    private Node left;

    private Node right;

    private Node(int value) {
        this.value = value;
    }

    public static Node withValue(int value) {
        return new Node(value);
    }

    public void addLeftChild(Node node) {
        this.left = node;
    }

    public Node getLeftChild() {
        return this.left;
    }

    public boolean hasLeftChild() {
        return this.left != null;
    }

    public void addRightChild(Node node) {
        this.right = node;
    }

    public Node getRightChild() {
        return this.right;
    }

    public boolean hasRightChild() {
        return this.right != null;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();

        output.append("[" + value);

        if (hasLeftChild()) {
            output.append(left);
        }

        if (hasRightChild()) {
            output.append(right);
        }

        output.append("]");

        return output.toString();
    }
}
