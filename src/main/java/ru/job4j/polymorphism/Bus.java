package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус исправен и может ехать");
    }

    @Override
    public void numberOfPassengers(int passengers) {
        System.out.println("Количество пассажиров: " + passengers);
    }

    @Override
    public double fillUp(int fuel) {
        return fuel * 22.4;
    }
}
