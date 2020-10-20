package ru.job4j.array;

public class Tasks {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i = i + 1) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
