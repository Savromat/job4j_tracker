package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    private static final String EXTRA = "extra cheese";

    public PizzaExtraCheese(String pizza) {
        super(pizza);
    }

    @Override
    public String name() {
        return super.name() + " + " + EXTRA;
    }
}
