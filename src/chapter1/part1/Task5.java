package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:08 PM
 */
public class Task5 {

    public static void main(String[] args) {
        final double x = 0.9 - 1.0 / 3 + 1.0 / 3;
        final double y = 0.1;
        StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
    }

}
