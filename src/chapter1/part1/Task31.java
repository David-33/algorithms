package chapter1.part1;

import utils.StdDraw;

/**
 * Created by David on 30/Apr/2019, at 3:27 PM
 */
public class Task31 {

    public static void main(String[] args) {
        if (args == null || args.length < 2) return;

        final int N = Integer.parseInt(args[0]);
        final double p = Double.parseDouble(args[1]);
        if (p < 0 || p > 1) return;

        final Point[] points = new Point[N];
        final double radius = 0.4;
        final double xCenter = 0.5;
        final double yCenter = 0.5;
        final double startAngle = Math.PI / 2;

        double x;
        double y;
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < N; i++) {
            x = xCenter + radius * Math.cos(startAngle + (2 * Math.PI * i) / N);
            y = yCenter + radius * Math.sin(startAngle + (2 * Math.PI * i) / N);
            points[i] = new Point(x, y);
            StdDraw.point(x, y);
        }

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (Math.random() < p) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
    }


    private static class Point {
        private double x;
        private double y;

        private Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

}
