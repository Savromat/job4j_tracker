package ru.job4j.oop;

public class Calculator {

    public static class Multiple {

        private final int result;

        public Multiple(int number) {
            result = number;
        }

        public int getResult() {
            return result;
        }
    }

    public static Multiple getMultiple(int value) {
        int result = value * value;
        return  new Multiple(result);
    }

    public static void main(String[] args) {
        Calculator.Multiple multiple = Calculator.getMultiple(3);
        System.out.println("Квадрат числа равен " + multiple.getResult());
    }
}
