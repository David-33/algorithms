package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:05 PM
 */
public class Task3 {

    public static void main(String[] args) {
        if (args.length >= 3) {
            final int a = Integer.parseInt(args[0]);
            final int b = Integer.parseInt(args[1]);
            final int c = Integer.parseInt(args[2]);
            StdOut.println(a == b && b == c ? "равны" : "не равны");
        }
    }

}
