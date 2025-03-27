class Book {
    static String libraryName = "Central Library";
    final String isbn;
    String bookAuthor;
    String bookName;

    Book(String name, String author, String ISBN) {
        this.bookName = name;
        this.bookAuthor = author;
        this.isbn = ISBN;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + bookName);
            System.out.println("Author: " + bookAuthor);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "Abdul Kalam", "1001");
        Book book2 = new Book("India 2020", "Abdul Kalam", "1002");

        Book.displayLibraryName();
        System.out.println();

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
    }
}
