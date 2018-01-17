package dev.sanket;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class SortestSubSegmentTest {

    @Test
    public void shouldReturnShortestSubSegment() {

        System.setIn(SortestSubSegmentTest.class.getResourceAsStream("/input1.txt"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setOut(ps);

        ShortestSubSegment.process();

        String output = baos.toString();
        
        Assert.assertEquals("Shortest sub segment is incorrect", "a programming test This", output);
    }
}
