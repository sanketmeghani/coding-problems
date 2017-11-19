package dev.sanket.equilibriumindex;

public class EquilibriumIndex {

    public int solution(int[] numbers) {

        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

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
