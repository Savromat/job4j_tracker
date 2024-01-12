package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    public static final String TOMATO = "extra tomato";

    public PizzaExtraCheeseExtraTomato(String pizza) {
        super(pizza);
    }

    @Override
    public String name() {
        return super.name() + " + " + TOMATO;
    }
}
