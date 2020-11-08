package ru.job4j;

public class TestClass {
    String name;
    static int count = 5;

    public int getCount() {
        return count;
    }

    public static int getStaticCount() {
        return count;
    }

    public int getGetStaticCount() {
        return getStaticCount();
    }

    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        System.out.println(testClass.getCount());
//        System.out.println(testClass.getGetStaticCount());
//        TestClass[] array = new TestClass[5];
//        System.out.println(array[0]);
    }
}
