package ru.job4j.condition;

import static java.lang.StrictMath.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 3, 4);
        System.out.println("result (0, 0) to (3, 4) " + result);
        double result2 = Point.distance(5, 11, 2, 2);
        System.out.println("result (5, 11) to (2, 2) " + result2);
    }
}