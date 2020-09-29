package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        int div1 = 10;
        int div2 = 1;
        while (num > 0) {
            sum += (num % div1) / div2;
            num -= num % div1;
            div1 *= 10;
            div2 *= 10;
        }
        return sum;
    }
}