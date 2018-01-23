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
public class ConnectedCellsTest {

    private int[][] matrix;

    @Parameter(value = 0)
    public String inputFileName;

    @Parameter(value = 1)
    public int largestRegionSize;

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] { { "/input1.txt", 5 }, { "/input2.txt", 14 }, { "/input3.txt", 16 },
                { "/input4.txt", 12 } });
    }

    private void loadMatrix(String fileName) {

        try (Scanner in = new Scanner(ConnectedCellsTest.class.getResourceAsStream(fileName))) {

            int n = in.nextInt();
            int m = in.nextInt();

            matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
        }
    }

    @Test
    public void shouldReturnLargestRegion() {
        loadMatrix(inputFileName);

        int output = ConnectedCells.connectedCell(matrix);

        assertEquals("Invalid largest region size", largestRegionSize, output);
    }
}
