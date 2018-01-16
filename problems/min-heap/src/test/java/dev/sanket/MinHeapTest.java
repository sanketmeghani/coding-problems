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
    }

    @Test
    public void shouldReturnTheOnlyRootNode() {

        minHeap.addNode(5);

        assertEquals("Test", Integer.valueOf(5), minHeap.peek());
    }
}
