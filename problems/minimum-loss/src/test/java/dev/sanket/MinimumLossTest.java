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
public class MinimumLossTest {

    private long[] prices;

    @Parameter(value = 0)
    public String inputFileName;

    @Parameter(value = 1)
    public int minimumLoss;

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] { { "/input1.txt", 2 }, { "/input2.txt", 2 } });
    }

    private void loadPrices(String fileName) {

        try (Scanner in = new Scanner(MinimumLossTest.class.getResourceAsStream(fileName))) {

            int n = in.nextInt();
            prices = new long[n];

            for (int count = 0; count < n; count++) {
                prices[count] = in.nextLong();
            }
        }
    }

    @Test
    public void shouldReturnMinimumLoss() {
        loadPrices(inputFileName);

        int minLoss = MinimumLoss.minimumLoss(prices);

        assertEquals("Invalid minimum loss", minimumLoss, minLoss);
    }
}
