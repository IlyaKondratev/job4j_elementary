package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {

        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(140);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + 2 + " euro. Test result : " + passedEuro);

        int inDollars = 180;
        int expectedDollars = 3;
        int outDollars = Converter.rubleToDollar(180);
        boolean passedDollars = expectedDollars == outDollars;
        System.out.println("180 rubles are " + 3 + " dollars. Test result : " + passedDollars);
    }
}