package dev.sanket.minheap;

import java.util.LinkedList;
import java.util.List;

public class MinHeap {

    private List<Integer> nodes = new LinkedList<>();

    public void addNode(int value) {
        nodes.add(Integer.valueOf(value));
        heapifyUp();
    }

    private void heapifyUp() {

        int currentIndex = nodes.size() - 1;
        int parentIndex = getParentIndex(currentIndex);

        while (parentIndex >= 0) {

            if (nodes.get(currentIndex) < nodes.get(parentIndex)) {

                swapNodes(currentIndex, parentIndex);
                currentIndex = parentIndex;
                parentIndex = getParentIndex(currentIndex);
            } else {
                break;
            }
        }
    }

    private int getParentIndex(int currentIndex) {
        return currentIndex == 0 ? -1 : (currentIndex - 1) / 2;
    }

    private void swapNodes(int currentIndex, int parentIndex) {
        int parentValue = nodes.get(parentIndex);
        nodes.set(parentIndex, nodes.get(currentIndex));
        nodes.set(currentIndex, parentValue);
    }

    public Integer peek() {
        return nodes.isEmpty() ? null : nodes.get(0);
    }

    public Integer poll() {

        if (nodes.isEmpty()) {
            return null;
        }

        Integer root = nodes.get(0);
        nodes.set(0, nodes.get(nodes.size() - 1));
        nodes.remove(nodes.size() - 1);

        heapifyDown();

        return root;
    }

    private void heapifyDown() {

        int currentIndex = 0;
        int childIndex = getChildIndex(currentIndex);

        while (childIndex != -1) {

            if (nodes.get(currentIndex) > nodes.get(childIndex)) {

                swapNodes(currentIndex, childIndex);
                currentIndex = childIndex;
                childIndex = getChildIndex(currentIndex);

            } else {
                break;
            }
        }
    }

    private int getChildIndex(int currentIndex) {

        int leftChildIndex = (2 * currentIndex) + 1;
        int rightChildIndex = (2 * currentIndex) + 2;

        int minChildIndex = -1;

        if (nodes.size() > leftChildIndex) {

            if (nodes.size() > rightChildIndex) {
                minChildIndex = nodes.get(leftChildIndex) <= nodes.get(rightChildIndex) ? leftChildIndex
                        : rightChildIndex;
            } else {
                minChildIndex = leftChildIndex;
            }
        }

        return minChildIndex;
    }
}
