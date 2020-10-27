package ru.job4j.factory;

public interface ShapeAbstFactory {

    Shape createTriangle();

    Shape createRectangle();

    Shape createEmpty();
}
