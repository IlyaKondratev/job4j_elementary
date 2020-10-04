package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int firstComp = first > second ? first : second;
        int secondComp = firstComp > third ? firstComp : third;
        return secondComp;
    }
}