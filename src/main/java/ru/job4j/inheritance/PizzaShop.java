package ru.job4j.inheritance;

public class PizzaShop {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Carbonara");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("Margarita");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("Pepperoni");
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
