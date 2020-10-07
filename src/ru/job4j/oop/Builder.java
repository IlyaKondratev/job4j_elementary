package ru.job4j.oop;

public class Builder {

    private double buildRate;
    private Builder helper;

    public House buildHouse(TechDesign techDesign) {
        return new House();
    }
}
