package chapter1.part1;

import utils.StdOut;

/**
 * Created by David on 25 Apr 2019, 11:18 PM
 */
public class Task20 {

    private static int sRecursionDepth;

    public static void main(String[] args) {
        final int N = 6;
        StdOut.println(Math.log(720));
        StdOut.println(lnFactorial(N));

        sRecursionDepth = 0;
        StdOut.println(lnFactorialWithDepth(N));
    }


    private static double lnFactorial(int N) {
        if (N <= 1) return 1;
        double factorial = lnFactorial(N - 1) * N;

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if ("lnFactorial".equals(stackTraceElements[2].getMethodName())) {
            return factorial;
        }
        return Math.log(factorial);
    }

    private static double lnFactorialWithDepth(int N) {
        if (N <= 1) return 1;
        ++sRecursionDepth;
        double factorial = lnFactorialWithDepth(N - 1) * N;
        if (sRecursionDepth > 1) {
            --sRecursionDepth;
            return factorial;
        }
        return Math.log(factorial);
    }

}
