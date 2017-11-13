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

    public void addRightChild(Node node) {
        this.right = node;
    }

    public Node getRightChild() {
        return this.right;
    }

    public int getValue() {
        return this.value;
    }
}
