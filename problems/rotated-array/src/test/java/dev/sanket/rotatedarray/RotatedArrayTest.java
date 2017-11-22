package dev.sanket.rotatedarray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RotatedArrayTest {

    @Test
    public void shouldNotFindPivotForNonRotatedArray() {

        int[] input = { 1, 4, 7, 9, 15, 23, 50, 100 };

        assertEquals("Pivot found for non-rotated array", -1, RotatedArray.findPivot(input));
    }

    @Test
    public void shouldFindPivotForRotatedArrayWithAscendingOrder() {

        int[] input = { 9, 15, 23, 50, 100, 1, 4, 7 };

        assertEquals("Incorrect pivot found for rotated array", 4, RotatedArray.findPivot(input));
    }

    @Test
    public void shouldFindPivotForRotatedArrayWithDescendingOrder() {

        int[] input = { 7, 4, 1, 100, 50, 23, 15, 9 };

        assertEquals("Incorrect pivot found for rotated array", 2, RotatedArray.findPivot(input));
    }
}
