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

//    private static int x = 5;
//
//    public static int sum(int y) {
//        return x + y;
//    }
//
//    public int multiply(int a) {
//        return x * a;
//    }
//
//    public static int minus(int a) {
//        return a - x;
//    }
//
//    public int divide(int a) {
//        return a / x;
//    }
//
//    public int sumAllOperation(int a) {
//        return sum(a) + multiply(a) + minus(a) + divide(a);
//    }
//
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        sum(10);
//        calculator.multiply(5);
//        Calculator.minus(8);
//        calculator.divide(4);
//        calculator.sumAllOperation(15);
//    }
}