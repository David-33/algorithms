package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:25 PM
 */
public class Task11 {

    public static void main(String[] args) {
        final boolean[][] matrix = {
                {true, false, false, false, false, false, true},
                {true, true, false, false, false, true, true},
                {true, false, true, false, true, false, true},
                {true, false, false, true, false, false, true},
                {true, false, true, false, true, false, true},
                {true, true, false, false, false, true, true},
                {true, false, false, false, false, false, true},
        };
        printMatrix(matrix);
    }


    private static void printMatrix(final boolean[][] matrix) {
        if (matrix != null && matrix.length > 0) {
            StdOut.print("\t");
            for (int i = 1; i <= matrix[0].length; i++) {
                StdOut.printf("%d\t", i);
            }
            StdOut.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = -1; j < matrix[i].length; j++) {
                    if (j == -1) {
                        StdOut.printf("%d\t", i + 1);
                    } else {
                        StdOut.printf("%c\t", matrix[i][j] ? '*' : ' ');
                    }
                }
                StdOut.println();
            }
        }
    }

}
