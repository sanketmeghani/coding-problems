package dev.sanket.rotatedarray;

import java.util.function.BiFunction;

public class RotatedArray {

    public static int findPivot(int[] input) {

        boolean ascending = false;

        if ((input[0] < input[1]) && (input[0] < input[input.length - 1])) {
            return -1;
        } else if ((input[0] < input[1]) && (input[0] > input[input.length - 1])) {
            ascending = true;
        }

        BiFunction<Integer, Integer, Boolean> inExpectedOrder;

        if (ascending) {
            inExpectedOrder = (a, b) -> a <= b;
        } else {
            inExpectedOrder = (a, b) -> a >= b;
        }

        for (int i = 0; i < input.length - 1; i++) {

            if (!inExpectedOrder.apply(input[i], input[i + 1])) {
                return i;
            }
        }

        return input.length;
    }
}
