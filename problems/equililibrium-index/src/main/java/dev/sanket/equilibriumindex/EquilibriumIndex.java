package dev.sanket.equilibriumindex;

import java.util.Arrays;

public class EquilibriumIndex {

    public int solution(int[] numbers) {

        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);

        int sumOfRightElements = 0;

        for (int index = numbers.length - 1; index >= 0; index--) {
            if ((sum - numbers[index]) == sumOfRightElements) {
                return index;
            }

            sum -= numbers[index];
            sumOfRightElements += numbers[index];
        }

        return -1;
    }
}
