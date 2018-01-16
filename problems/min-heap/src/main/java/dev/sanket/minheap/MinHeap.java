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
        return (currentIndex - 1) / 2;
    }

    private void swapNodes(int currentIndex, int parentIndex) {
        int parentValue = nodes.remove(parentIndex);
        nodes.add(parentIndex, nodes.get(currentIndex));
        nodes.remove(currentIndex);
        nodes.add(currentIndex, parentValue);
    }

    public Integer peek() {
        return nodes.isEmpty() ? null : nodes.get(0);
    }

    public Integer poll() {
        return null;
    }
}
