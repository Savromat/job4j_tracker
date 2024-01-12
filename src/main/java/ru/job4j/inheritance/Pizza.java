package ru.job4j.inheritance;

public class Pizza {

    private String pizza;

    public Pizza(String pizza) {
        this.pizza = pizza;
    }

    public String name() {
        return "Just tasty pizza - " + pizza;
    }
}
