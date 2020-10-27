package ru.job4j.factory;

public class Empty implements Shape {
    @Override
    public String draw() {
        return "It's an empty shape.";
    }
}
