package ru.job4j.factory;

public class ShapeFactory {
    ShapeAbstFactory shapeFactory;

    public ShapeFactory(ShapeAbstFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public Shape create(String name) {
        Shape shape = shapeFactory.createEmpty();
        if (name.equalsIgnoreCase("triangle")) {
            shape = shapeFactory.createTriangle();
        } else if (name.equalsIgnoreCase("rectangle")) {
            shape = shapeFactory.createRectangle();
        }
        return shape;
    }

}
