package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
//        int result = first > second ? (first > third ? first : third) : (second > third ? second : third);
        int firstComp = first > second ? first : second;
        int secondComp = firstComp > third ? firstComp : third;
        return secondComp;
    }
}