package LibraryPackage;
import java.util.ArrayList;
import java.util.List;

public class Library {

private  List<Book> list;

    public Library() {
       list = new ArrayList<>();}

    public void addBook(Book book){
      list.add(book);}

    public List<Book> getList() {
        return list;}

    public void printAvailableBooks(){

        for (Book bookPrint : list) {
            if (bookPrint.isAvailable() ) {
               bookPrint.displayInfo();
            }
        }
    }
    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : list) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    }

