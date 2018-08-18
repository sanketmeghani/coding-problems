package dev.sanket;

import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleTest {

    @Test
    public void shouldReturnLargestRectangle() {

        int[] h = { 1, 2, 3, 4, 5 };
        long largestRectangle = LargestRectangle.largestRectangle(h);

        Assert.assertEquals("Invalid largest rectangle", 9, largestRectangle);
    }
}
