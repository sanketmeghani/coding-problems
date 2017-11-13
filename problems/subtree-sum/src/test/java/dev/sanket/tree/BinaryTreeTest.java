package dev.sanket.tree;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void shouldReturnThreeNodes() {

        int[] values = { 3, 4, 0, 1, 2, 0, 7 };

        BinaryTree binaryTree = BinaryTree.fromArray(values);
        List<Node> nodes = binaryTree.findNodes(7);

        assertNotNull(nodes);
        assertFalse("No nodes with given target found", nodes.isEmpty());
        assertEquals("Unexpected number of nodes found", 3, nodes.size());
    }
}
