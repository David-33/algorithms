package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 11:01 PM
 */
public class Task18 {

    public static void main(String[] args) {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));
    }


    private static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

}
