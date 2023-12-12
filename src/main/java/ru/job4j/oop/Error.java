package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Активен: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 1, "в работе");
        Error error3 = new Error(false, 2, "ошибка устранена");
        error1.showInfo();
        error2.showInfo();
        error3.showInfo();
    }
}
