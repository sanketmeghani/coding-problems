package dev.sanket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

import dev.sanket.minheap.MinHeap;

public class MinHeapTest {

    private MinHeap minHeap;

    @Before
    public void setup() {
        minHeap = new MinHeap();
    }

    @Test
    public void shouldReturnNullForEmptyHeap() {
        assertNull(minHeap.peek());
        assertNull(minHeap.poll());
    }

    @Test
    public void shouldReturnTheOnlyRootNode() {

        minHeap.addNode(5);

        assertEquals("Invalid root value", Integer.valueOf(5), minHeap.peek());
    }

    @Test
    public void shouldReturnMinValue() {

        minHeap.addNode(10);
        minHeap.addNode(7);
        minHeap.addNode(9);
        minHeap.addNode(2);
        minHeap.addNode(8);

        assertEquals("Invalid root value", Integer.valueOf(2), minHeap.peek());
    }
    
    @Test
    public void shouldReturnMinValuePostRootRemoval() {
        
        minHeap.addNode(10);
        minHeap.addNode(7);
        minHeap.addNode(9);
        minHeap.addNode(2);
        minHeap.addNode(8);

        assertEquals("Invalid root value", Integer.valueOf(2), minHeap.peek());
        assertEquals("Invalid value removed", Integer.valueOf(2), minHeap.poll());
        assertEquals("Invalid root value", Integer.valueOf(7), minHeap.peek());
    }
    
    @Test
    public void shouldReturnNullPostOnlyNodeRemoval() {
        
        minHeap.addNode(2);
        
        assertEquals("Invalid root value", Integer.valueOf(2), minHeap.peek());
        assertEquals("Invalid value removed", Integer.valueOf(2), minHeap.poll());
        assertNull(minHeap.peek());
    }
}
