import java.util.Scanner;

class Book {
    private String TitleOfTheBook;
    private String AuthorOfTheBook;
    private int PriceOfTheBook;
    private boolean isAvailable;

    Book() {
        this.TitleOfTheBook = "Unknown";
        this.AuthorOfTheBook = "Unknown";
        this.PriceOfTheBook = 0;
        this.isAvailable = true;
    }

    Book(String title, String author, int price) {
        this.TitleOfTheBook = title;
        this.AuthorOfTheBook = author;
        this.PriceOfTheBook = price;
        this.isAvailable = true;
    }

    void displayDetails() {
        System.out.println("\nBook Details");
        System.out.println("The Title of Book is: " + TitleOfTheBook);
        System.out.println("The Author of Book is: " + AuthorOfTheBook);
        System.out.println("The Price of Book is: " + PriceOfTheBook);
        System.out.println("Availability : " + (isAvailable ? "Available" : "Not Available"));
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\nYou have successfully Borrowed the Book");
        } else {
            System.out.println("\nSorry, " + TitleOfTheBook + " is not available.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Book Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Author of the Book:");
        String author = input.nextLine();
        System.out.print("Enter the Price of the Book: ");
        int price = input.nextInt();

        Book myBook = new Book(name, author, price);
        myBook.displayDetails();

        System.out.print("\nDo you want to borrow the book? (yes/no)");
        input.nextLine();
        String response = input.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            myBook.borrowBook();
        } else {
            System.out.println("Thank you for visiting");
        }

        input.close();
    }
}
