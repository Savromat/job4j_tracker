package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load -= this.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(95);
        Battery second = new Battery(0);
        System.out.println("First. " + first.about());
        System.out.println("Second. " + second.about());
        first.exchange(second);
        System.out.println("First. " + first.about());
        System.out.println("Second. " + second.about());
    }
}