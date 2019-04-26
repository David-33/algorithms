package chapter1.part1;

import utils.StdOut;

import java.util.Arrays;

/**
 * Created by David on 25 Apr 2019, 10:50 PM
 */
public class Task15 {

    public static void main(String[] args) {
        final int M = 10;
        final int[] arr = {0, 1, 1, 5, 9, 2, 0, 1, 2, 3, 7, 8, 8, 0, 3};
        final int[] histogram = histogram(arr, M);
        StdOut.println("Array: " + Arrays.toString(arr));
        StdOut.println("Histogram: " + Arrays.toString(histogram));
        StdOut.println("Array length: " + arr.length);
        StdOut.println("Histogram sum: " + Arrays.stream(histogram).sum());
    }


    private static int[] histogram(final int[] a, final int M) {
        int[] histogram = new int[M];
        for (int i = 0; i < M; i++) {
            histogram[i] = countOf(a, i);
        }
        return histogram;
    }

    private static int countOf(final int[] arr, final int element) {
        int count = 0;
        for (int value : arr) {
            if (value == element) ++count;
        }
        return count;
    }

}
