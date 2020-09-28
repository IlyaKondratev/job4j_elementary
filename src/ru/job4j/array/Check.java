package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean x : data) {
            if (data[0] != x) {
                result = false;
                break;
            }
        }
        return result;
    }
}