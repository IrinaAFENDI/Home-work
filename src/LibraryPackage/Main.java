package LibraryPackage;

public class Main {

    public static void main(String[] args) {

        Library library = Library.list;

        // Добавляем книги в библиотеку
        Book book1 = new Book("Java", "Sierra", 2021, true);
        library.addBook(book1);

        Book book2 = new Book("еЕЕЕЕЕ", "Sierra", 221, true);
        library.addBook(book2);

        Book book3 = new Book("JS", "Nert", 2022, true);
        library.addBook(book3);

        Book book4 = new Book("Forest", "Redut");
        library.addBook(book4);

        Book book5 = new Book("Doors", "Bernot");
        library.addBook(book5);

        // Печатаем доступные книги
        library.printAvailableBooks();

        // Ищем книги по автору
        System.out.println("Книги автора Sierra:");
        System.out.println(library.findBooksByAuthor("Sierra"));

        // Берем первую доступную книгу
        book1.borrowBook();

        // Печатаем доступные книги после выдачи
        library.printAvailableBooks();

        // Берем вторую книгу
        book2.borrowBook();

        // Печатаем доступные книги после второй выдачи
        library.printAvailableBooks();

        // Возвращаем первую книгу
        book1.returnBook();

        // Печатаем доступные книги после возврата
        library.printAvailableBooks();
    }
}