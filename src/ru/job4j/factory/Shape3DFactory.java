package ru.job4j.factory;

public class Shape3DFactory implements ShapeFactory {
    public Shape create(String name) {
        Shape shape = new Empty();
        if (name.equalsIgnoreCase("triangle")) {
            shape = new Triangle3D();
        } else if (name.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle3D();
        }
        return shape;
    }
}
