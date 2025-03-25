import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {
    private double fileSizeMB;

    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("\nEBook Details:");
        System.out.println("ISBN      : " + ISBN);
        System.out.println("Title     : " + title);
        System.out.println("File Size : " + fileSizeMB + "MB");
    }
}

public class BookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();

        System.out.print("Enter Book Title: ");
        String title = input.nextLine();

        System.out.print("Enter Author Name: ");
        String author = input.nextLine();

        System.out.print("Enter EBook File Size (in MB): ");
        double size = input.nextDouble();

        Book book = new Book(isbn, title, author);
        book.displayBookDetails();

        EBook ebook = new EBook(isbn, title, author, size);
        ebook.displayEBookDetails();

        input.close();
    }
}
