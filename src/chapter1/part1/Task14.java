package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:45 PM
 */
public class Task14 {

    public static void main(String[] args) {
        final int n = 4;
        final int base = 2;
        StdOut.println(lg(n));
        StdOut.println(Math.log(n) / Math.log(base));
    }


    private static int lg(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Argument can not be negative!");

        int result = 0;
        for (int i = 1; i <= n; i <<= 1) {
            ++result;
        }
        return result - 1;
    }

}
