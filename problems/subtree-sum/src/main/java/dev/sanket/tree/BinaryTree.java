package dev.sanket.tree;

import java.util.ArrayList;
import java.util.List;

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

    public List<Node> findNodes(int target) {

        ArrayList<Node> nodes = new ArrayList<>();

        populateNodesWithTarget(root, target, nodes);

        return nodes;
    }

    private int populateNodesWithTarget(Node node, int target, ArrayList<Node> nodes) {

        int subTreeSum = node.getValue();

        if (node.hasLeftChild()) {
            subTreeSum += populateNodesWithTarget(node.getLeftChild(), target, nodes);
        }

        if (node.hasRightChild()) {
            subTreeSum += populateNodesWithTarget(node.getRightChild(), target, nodes);
        }

        if (subTreeSum == target) {
            nodes.add(node);
        }

        return subTreeSum;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
