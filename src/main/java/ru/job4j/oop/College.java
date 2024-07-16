package ru.job4j.oop;

public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman; // up casting
        Object object = freshman; // up casting
    }
}
