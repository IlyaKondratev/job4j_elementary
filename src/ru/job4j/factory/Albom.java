package ru.job4j.factory;

public class Albom {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory(new Shape2DFactory());
        System.out.println(shapeFactory.create("rectangle").draw());

    }
}
