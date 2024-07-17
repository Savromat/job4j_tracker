package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - передвигается по скоростным трассам");
    }

    @Override
    public void typeOfFuel() {
        System.out.println("Тип топлива для " + getClass().getSimpleName() + " - бензин");
    }
}