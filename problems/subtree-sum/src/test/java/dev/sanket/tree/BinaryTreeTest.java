package dev.sanket.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void shouldReturnThreeNodes() {

        int[] values = { 3, 4, 0, 1, 2, 0, 7 };
        int target = 7;
        
        BinaryTree binaryTree = BinaryTree.fromArray(values);
        List<Node> nodes = binaryTree.findNodes(target);

        assertNotNull(nodes);
        assertFalse("No nodes with given target found", nodes.isEmpty());
        assertEquals("Unexpected number of nodes found", 3, nodes.size());
    }
    
    @Test
    public void shouldReturnOneNodes() {

        int[] values = { 3, 4, 0, 1, 2, 0, 7 };
        int target = 2;
        
        BinaryTree binaryTree = BinaryTree.fromArray(values);
        List<Node> nodes = binaryTree.findNodes(target);

        assertNotNull(nodes);
        assertFalse("No nodes with given target found", nodes.isEmpty());
        assertEquals("Unexpected number of nodes found", 1, nodes.size());
    }
    
    @Test
    public void shouldNotReturnAnyNode() {
        
        int[] values = { 3, 4, 0, 1, 2, 0, 7 };
        int target = 13;
        
        BinaryTree binaryTree = BinaryTree.fromArray(values);
        List<Node> nodes = binaryTree.findNodes(target);

        assertNotNull(nodes);
        assertTrue("No nodes with given target found", nodes.isEmpty());
    }
}
