import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        collegeLibrary.addBook(book2);
        collegeLibrary.addBook(book3);

        cityLibrary.displayBooks();
        System.out.println();
        collegeLibrary.displayBooks();
    }
}
