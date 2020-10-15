package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Поехали!");
    }

    @Override
    public void getPassengers(int passengers) {
        System.out.println("Везем " + passengers + " пассажиров.");
    }

    @Override
    public double fill(double fuelAmount) {
        double price = 44.5;
        return fuelAmount * price;
    }
}
