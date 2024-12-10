package LibraryPackage;

public class Book {

   private  String title;
    private String author;
   private int year ;
   private boolean isAvailable ;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable= true;
    }

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable ;
    }
    public void borrowBook() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книгу '" + title  + "' взяли" );
        } else {
            System.out.println("Книги '" + title  + "' уже нет в библиотеке"  );
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга '" + title + "' есть в библиотеке.");
    }

       public void displayInfo() {
           System.out.println("Название: " + title);
           System.out.println("Автор: " + author);
           System.out.println("Год издания: " + year);
           System.out.println("Доступность: " + (isAvailable ? " есть" : "нет в библиотеке"));
           System.out.println();
       }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
