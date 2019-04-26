package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:57 PM
 */
public class Task16 {

    public static void main(String[] args) {
        StdOut.println(exR1(6));
    }


    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

}
