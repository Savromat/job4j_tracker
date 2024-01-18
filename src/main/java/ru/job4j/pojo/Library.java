package ru.job4j.pojo;

public class Library {

    public static Book[] changeBooks(Book[] array, int index1, int index2) {
        Book i = null;
        i = array[index1];
        array[index1] = array[index2];
        array[index2] = i;
        return array;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 5000);
        Book book2 = new Book("Мастер и Маргарита", 450);
        Book book3 = new Book("Clean code", 600);
        Book book4 = new Book("Титан", 320);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("После перестановки книг с индексами 0 и 3");
        Library.changeBooks(books, 0, 3);
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Вывод книг с именем \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (books[i].getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
