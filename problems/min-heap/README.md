# Min Heap

A [binary heap](https://en.wikipedia.org/wiki/Binary_heap) is defined as a binary tree with two additional constraints:

**Shape property:** a binary heap is a complete binary tree; that is, all levels of the tree, except possibly the last one (deepest) are fully filled, and, if the last level of the tree is not complete, the nodes of that level are filled from left to right.

**Heap property:** the key stored in each node is either greater than or equal to (≥) or less than or equal to (≤) the keys in the node's children, according to some total order.

Heaps where the parent key is less than or equal to (<=) the child keys are called min-heaps.

Write a programme to implement a min-heap.