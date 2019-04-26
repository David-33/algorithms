package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:19 PM
 */
public class Task9 {

    public static void main(String[] args) {
        final int N = 1023;
        StdOut.println(Integer.toBinaryString(N));
        StdOut.println(toBinaryString1(N));
        StdOut.println(toBinaryString2(N));
    }


    private static String toBinaryString1(final int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        return s;
    }

    private static String toBinaryString2(final int N) {
        StringBuilder builder = new StringBuilder();
        for (int n = N; n != 0; n >>>= 1)
            builder.insert(0, (n & 1));
        return builder.toString();
    }

}
