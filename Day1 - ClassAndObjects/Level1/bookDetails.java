import java.util.Scanner;

class Book {
    String Title;
    String Author;
    int Price;

    Book(String Title, String Author, int Price) {
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    void displayDetails() {
        System.out.println("The Title of the Book is " + Title + " and the Author of the Book is " + Author
                + " and the Price of the Book is " + Price);
    }
}

public class bookDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Title of the Book: ");
        String title = input.nextLine();
        System.out.print("Enter the Author of the Book: ");
        String author = input.nextLine();
        System.out.print("Enter the Price of the Book: ");
        int price = input.nextInt();

        Book bookdets = new Book(title, author, price);
        bookdets.displayDetails();

        input.close();
    }
}
