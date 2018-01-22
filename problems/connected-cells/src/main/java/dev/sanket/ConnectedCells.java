package dev.sanket;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConnectedCells {

    public static int connectedCell(int[][] matrix) {

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += rightAdjascentRegions(matrix, i, j) + bottomAdjascentRegions(matrix, i, j)
                            - removeDuplicateAdditions(matrix, i, j);
                }
            }
        }

        return Stream.of(matrix).flatMapToInt(IntStream::of).max().getAsInt();
    }

    private static int removeDuplicateAdditions(int[][] matrix, int i, int j) {
        return ((i < matrix.length - 1) && (j < matrix[i].length - 1) && (matrix[i + 1][j] != 0)
                && (matrix[i][j + 1] != 0)) ? matrix[i + 1][j + 1] : 0;
    }

    private static int rightAdjascentRegions(int[][] matrix, int i, int j) {
        return (j < matrix[i].length - 1) ? matrix[i][j + 1] : 0;
    }

    private static int bottomAdjascentRegions(int[][] matrix, int i, int j) {
        return (i < matrix.length - 1) ? matrix[i + 1][j] : 0;
    }
}
