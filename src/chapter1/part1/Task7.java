package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 10:12 PM
 */
public class Task7 {

    public static void main(String[] args) {
        {
            double t = 9.0;
            while (Math.abs(t - 9.0 / t) > .001)
                t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
        {
            int sum = 0;
            for (int i = 1; i < 1000; i++)
                for (int j = 0; j < i; j++)
                    sum++;
            StdOut.println(sum);
        }
        {
            int sum = 0;
            for (int i = 1; i < 1000; i *= 2)
                for (int j = 0; j < i; j++)
                    sum++;
            StdOut.println(sum);
        }
    }

}
