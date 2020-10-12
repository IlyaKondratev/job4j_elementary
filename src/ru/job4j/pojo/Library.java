package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book crimeAndPunishment = new Book("Crime and punishment", 710);
        Book annaKarenina = new Book("Anna Karenina", 864);
        Book cleanCode = new Book("Clean code", 520);
        Book idiot = new Book("Idiot", 660);
        Book[] books = new Book[4];
        books[0] = crimeAndPunishment;
        books[1] = annaKarenina;
        books[2] = cleanCode;
        books[3] = idiot;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].toString());
            }
        }
    }
}
