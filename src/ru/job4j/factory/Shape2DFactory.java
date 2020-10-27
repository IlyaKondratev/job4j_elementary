package ru.job4j.factory;

public class Shape2DFactory implements ShapeFactory {
    public Shape create(String name) {
        Shape shape = new Empty();
        if (name.equalsIgnoreCase("triangle")) {
            shape = new Triangle2D();
        } else if (name.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle2D();
        }
        return shape;
    }
}
