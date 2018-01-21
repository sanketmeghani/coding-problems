package dev.sanket;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectedCellsTest {

    private int[][] matrix;

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
        loadMatrix("/input1.txt");

        int output = ConnectedCells.connectedCell(matrix);

        assertEquals("Invalid largest region size", 5, output);
    }
}
