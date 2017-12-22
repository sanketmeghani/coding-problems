package dev.sanket;

public class Solution {

    public static int findSecondSmallest(int[] input) {

        if (input.length == 1) {
            return input[0];
        }

        int smallest;
        int secondSmallest;

        if (input[0] < input[1]) {
            smallest = input[0];
            secondSmallest = input[1];
        } else {
            smallest = input[1];
            secondSmallest = input[0];
        }

        for (int index = 2; index < input.length; index++) {
            if (input[index] <= smallest) {
                secondSmallest = smallest;
                smallest = input[index];
            } else if (input[index] < secondSmallest) {
                secondSmallest = input[index];
            }
        }

        return secondSmallest;
    }
}
