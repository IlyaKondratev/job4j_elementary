package ru.job4j.factory;

public class Shape2DFactory implements ShapeAbstFactory {

    @Override
    public Shape createTriangle() {
        return new Triangle2D();
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle2D();
    }

    @Override
    public Shape createEmpty() {
        return new Empty();
    }
}
