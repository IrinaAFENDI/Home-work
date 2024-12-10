package LibraryPackage;

import java.util.ArrayList;

public class Main {

    static Library library;

    static {
        System.out.println("Создание библиотеки...");
        library = new Library();
        library.addBook(new Book("Java", "Sierra", 2021, true));
        library.addBook(new Book("еЕЕЕЕЕ", "Sierra", 221, true));
        library.addBook(new Book("JS", "Nert", 2022, true));
        library.addBook(new Book("Forest", "Redut"));
        library.addBook(new Book("Doors", "Bernot"));
    }


    public static void main(String[] args) {

        library.printAvailableBooks();

        System.out.println( library.findBooksByAuthor("Sierra"));

        library.getList().get(0).borrowBook();


        library.printAvailableBooks();

        library.getList().get(1).borrowBook();

        library.printAvailableBooks();

        library.getList().get(0).returnBook();

        library.printAvailableBooks();



    }
}