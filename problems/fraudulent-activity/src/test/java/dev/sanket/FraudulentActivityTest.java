package dev.sanket;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FraudulentActivityTest {

    private int[] expenditure;

    private int d;

    @Parameter(value = 0)
    public String inputFileName;

    @Parameter(value = 1)
    public int numberOfNotifications;

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] { { "/input1.txt", 2 }, { "/input2.txt", 0 } });
    }

    private void readInput(String fileName) {

        try (Scanner in = new Scanner(FraudulentActivityTest.class.getResourceAsStream(fileName))) {

            int n = in.nextInt();

            d = in.nextInt();
            expenditure = new int[n];

            for (int count = 0; count < n; count++) {
                expenditure[count] = in.nextInt();
            }
        }
    }

    @Test
    public void shouldCalculateFraudulentActivityNotifications() {
        readInput(inputFileName);

        int result = FraudulentActivity.activityNotifications(expenditure, d);

        assertEquals("Invalid number of fraudulent activity notifications", numberOfNotifications, result);
    }
}
