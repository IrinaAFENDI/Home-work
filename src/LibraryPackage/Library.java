package LibraryPackage;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static Library list;
    private ArrayList<Book> books; // Список книг

    static {
        list = new Library();
    }

    private Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle()) &&
                    b.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                System.out.println("Книга " + book.getTitle() + " автор: " + book.getAuthor() + " уже есть в библиотеке.");
                return;
            }
        }
        books.add(book); // Добавление книги в список
        System.out.println("Книга " + book.getTitle() + " автор: " + book.getAuthor() + " добавлена в библиотеку.");
    }

    public List<Book> getList() {
        return new ArrayList<>(books); // Возвращаем копию списка книг
    }

    public void printAvailableBooks() {
        for (Book bookPrint : books) {
            if (bookPrint.isAvailable()) {
                bookPrint.displayInfo(); // Вывод информации о доступных книгах
            }
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) { // Итерируемся по списку книг
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book); // Добавляем книгу в список найденных
            }
        }
        return foundBooks; // Возвращаем список найденных книг
    }


}