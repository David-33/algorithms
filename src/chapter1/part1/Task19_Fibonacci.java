package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 11:12 PM
 */
public class Task19_Fibonacci {

    private static long[] sBuffer;

    public static void main(String[] args) {
        final int maxN = 100;
        sBuffer = new long[maxN];
        for (int N = 0; N < maxN; N++) {
            StdOut.println(N + " " + F(N));
        }
    }


    private static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (sBuffer[N] == 0) sBuffer[N] = F(N - 1) + F(N - 2);
        return sBuffer[N];
    }

}
