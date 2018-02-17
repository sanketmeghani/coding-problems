package dev.sanket;

import java.util.Arrays;

public class FraudulentActivity {

    public static int activityNotifications(int[] expenditure, int d) {

        int[] range = Arrays.copyOfRange(expenditure, 0, d);
        Arrays.sort(range);

        int notificationCount = 0;

        for (int i = d; i < expenditure.length; i++) {

            double median = findMedian(d, range);

            if (expenditure[i] >= (2 * median)) {
                notificationCount++;
            }

            int removedIndex = Arrays.binarySearch(range, expenditure[i - d]);

            range[removedIndex] = expenditure[i];

            if (removedIndex == 0 || ((removedIndex < range.length - 1) && expenditure[i] > range[removedIndex + 1])) {

                while (removedIndex < range.length - 1 && range[removedIndex] > range[removedIndex + 1]) {
                    swap(range, removedIndex, removedIndex + 1);
                    removedIndex++;
                }
            } else if (removedIndex == range.length - 1
                    || ((removedIndex > 0) && expenditure[i] < range[removedIndex - 1])) {

                while (removedIndex > 0 && range[removedIndex] < range[removedIndex - 1]) {
                    swap(range, removedIndex, removedIndex - 1);
                    removedIndex--;
                }
            }
        }

        return notificationCount;
    }

    private static double findMedian(int d, int[] range) {
        return (d % 2 == 0) ? ((double) range[d / 2] + (double) range[(d - 1) / 2]) / 2 : range[d / 2];
    }

    private static void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
