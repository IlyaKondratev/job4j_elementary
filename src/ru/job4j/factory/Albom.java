package ru.job4j.factory;

public class Albom {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new Shape3DFactory();
        System.out.println(shapeFactory.create("rectangle").draw());

    }
}
