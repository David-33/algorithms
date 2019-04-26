package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:38 PM
 */
public class Task13 {

    public static void main(String[] args) {
        final int M = 5;
        final int N = 7;
        final int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * (M + N));
            }
        }

        print(matrix);
        StdOut.println();
        printTransposed(matrix);
    }


    private static void print(final int[][] matrix) {
        if (matrix != null) {
            for (int[] row : matrix) {
                for (int a : row) {
                    StdOut.printf("%d\t", a);
                }
                StdOut.println();
            }
        }
    }

    private static void printTransposed(final int[][] matrix) {
        if (matrix != null && matrix.length > 0) {
            final int columnsCount = matrix[0].length;
            for (int i = 0; i < columnsCount; i++) {
                for (int[] column : matrix) {
                    StdOut.printf("%d\t", column[i]);
                }
                StdOut.println();
            }
        }
    }

}
