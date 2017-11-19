package dev.sanket.equilibriumindex;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class EquilibriumIndexTest {

    @Test
    public void shouldReturnRightIndex() {

        int[] numbers = { -1, 3, -4, 5, 1, -6, 2, 1 };

        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        int index = equilibriumIndex.solution(numbers);

        assertTrue("Incorrect equilibrium index returned", Arrays.asList(1, 3, 7).contains(index));
    }
}
