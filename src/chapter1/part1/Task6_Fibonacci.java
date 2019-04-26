package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:10 PM
 */
public class Task6_Fibonacci {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}
