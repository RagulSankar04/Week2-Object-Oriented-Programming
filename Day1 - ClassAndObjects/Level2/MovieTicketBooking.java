import java.util.Scanner;

class MovieTicket {
    String Name;
    int SeatNo;
    int Price;
    boolean isBooked;

    MovieTicket(String name, int seatNo, int price) {
        this.Name = name;
        this.SeatNo = seatNo;
        this.Price = price;
        this.isBooked = false;
    }

    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket Booked Successfully for " + Name + " at seat " + SeatNo);
        } else {
            System.out.println("Seat " + SeatNo + " is already booked");
        }
    }

    void displayTickets() {
        if (isBooked) {
            System.out.println("Movie Name: " + Name);
            System.out.println("Seat Number: " + SeatNo);
            System.out.println("Price: " + Price);
        } else {
            System.out.println("No Tickets Booked yet");
        }
    }

}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Movie Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Seat Number: ");
        int seatNo = input.nextInt();
        System.out.print("Enter the Ticket Price: ");
        int price = input.nextInt();

        MovieTicket ticket = new MovieTicket(name, seatNo, price);

        while (true) {
            System.out.println("\n1. Book Tickets");
            System.out.println("2. Display Tickets");
            System.out.println("3. Exit");
            System.out.println("Choose an option");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayTickets();
                    break;
                case 3:
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}