package dev.sanket;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void shouldReturnCorrectMaxNumberTestOne() {

        int[] input = { 99, 8, 76, 45, 66, 9, 7, 33, 5, 42 };
        String expected = "9998776665454233";

        String output = MaxNumber.formMaxNumber(input);

        Assert.assertEquals(expected, output);
    }

    @Test
    public void shouldReturnCorrectMaxNumberTestTwo() {

        int[] input = { 123, 987, 9, 99, 98, 97, 34, 33, 35, 45 };
        String expected = "999989879745353433123";

        String output = MaxNumber.formMaxNumber(input);

        Assert.assertEquals(expected, output);
    }
}
