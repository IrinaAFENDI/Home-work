package LibraryPackage;

public class Book {

    private String title;
    private String author;
    private Integer year;
    private Boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0; // Установка значения по умолчанию
        this.isAvailable = true; // Установка значения по умолчанию
    }

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }


    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable != null && isAvailable) {
            isAvailable = false;
            System.out.println("Книгу '" + title + "' взяли");
        } else {
            System.out.println("Книги '" + title + "' уже нет в библиотеке");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга '" + title + "' есть в библиотеке.");
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + (year != null ? year.toString() : "неизвестно"));
        System.out.println("Доступность: " + (isAvailable != null && isAvailable ? "есть" : "нет в библиотеке"));
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + (year != null ? year.toString() : "неизвестно") +
                ", isAvailable=" + (isAvailable != null ? isAvailable.toString() : "неизвестно") +
                '}';
    }
}
