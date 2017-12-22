package dev.sanket;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void shouldReturnFirstElement() {
        int[] input = { 0 };

        assertEquals("Should return first element in array with single value", 0, Solution.findSecondSmallest(input));
    }

    @Test
    public void shouldReturnSecondSmallestInTwoElementsArray() {
        int[] input = { 0, 1 };

        assertEquals("Should return second smallest element in array with two values", 1,
                Solution.findSecondSmallest(input));
    }

    @Test
    public void shouldReturnSecondSmallestInMultipleElementArray() {
        int[] input = { 0, 5, 2, 4, 6 };

        assertEquals("Should return second smallest element in array with multiple values", 2,
                Solution.findSecondSmallest(input));
    }

    @Test
    public void shouldReturnSmallestInArrayWithNegativeValues() {
        int[] input = { 10, -1, 5, 7, 4, -2, -10 };

        assertEquals("Should return second smallest element in array with negative values", -2,
                Solution.findSecondSmallest(input));
    }
}
