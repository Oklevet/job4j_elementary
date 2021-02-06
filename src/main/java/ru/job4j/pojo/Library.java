package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Qwe", 150);
        Book book2 = new Book("Asdqwe", 300);
        Book book3 = new Book("Clean Code", 400);
        Book book4 = new Book("Qwezxc", 11034);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book b : books) {
            System.out.println(b.getName() + " - " + b.getNumber());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println(System.lineSeparator() + "Shown swap books with 0 and 3 indexes");
        for (Book b : books) {
            System.out.println(b.getName() + " - " + b.getNumber());
        }
        System.out.println(System.lineSeparator() + "Shown only books with name \"Clean Code\"");
        for (Book b : books) {
            if (b.getName().equals("Clean Code")) {
                System.out.println(b.getName() + " - " + b.getNumber());
            }
        }
    }
}
