package ru.job4j.factory;

public class Shape3DFactory implements ShapeAbstFactory {

    @Override
    public Shape createTriangle() {
        return new Triangle3D();
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle3D();
    }

    @Override
    public Shape createEmpty() {
        return new Empty();
    }
}
