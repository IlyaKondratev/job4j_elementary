package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            rsl = Arrays.copyOf(right, right.length);
        } else if (right.length == 0) {
            rsl = Arrays.copyOf(left, left.length);
        } else {
            int indexLeft = 0;
            int indexRight = 0;
            for (int i = 0; i < rsl.length; i++) {
                if (indexLeft < left.length && indexRight < right.length) {
                    rsl[i] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
                } else if (indexLeft == left.length) {
                    rsl[i] = right[indexRight++];
                } else {
                    rsl[i] = left[indexLeft++];
                }
            }
        }
        return rsl;
    }
}