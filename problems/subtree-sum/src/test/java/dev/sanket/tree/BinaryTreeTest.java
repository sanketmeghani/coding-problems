package dev.sanket.tree;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void shouldReturnThreeNodes() {

        int[] values = { 3, 4, 0, 1, 2, 0, 7 };
        
        BinaryTree binaryTree = BinaryTree.fromArray(values);
    }
}
