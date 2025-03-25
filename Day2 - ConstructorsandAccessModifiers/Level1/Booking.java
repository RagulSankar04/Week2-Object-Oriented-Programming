import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Ragul", "Deluxe", 2);
    }

    HotelBooking(String name, String type, int nights) {
        this.guestName = name;
        this.roomType = type;
        this.nights = nights;
    }

    HotelBooking(HotelBooking b) {
        this.guestName = b.guestName;
        this.roomType = b.roomType;
        this.nights = b.nights;
    }

    void displayDetails() {
        System.out.println("------------------------------");
        System.out.println("The Guest Name is: " + guestName);
        System.out.println("The Type of Room is: " + roomType);
        System.out.println("The No of Nights is: " + nights);
        System.out.println("------------------------------");
    }
}

public class Booking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Guest Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Type of Room: ");
        String type = input.nextLine();
        System.out.print("Enter the number of nights: ");
        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid number of nights: ");
            input.next();
        }
        int nights = input.nextInt();

        System.out.println("\nAuto Booking");
        HotelBooking autoBooking = new HotelBooking();
        autoBooking.displayDetails();

        System.out.println("\nManual Booking");
        HotelBooking manualBooking = new HotelBooking(name, type, nights);
        manualBooking.displayDetails();

        System.out.println("\nCopy Booking");
        HotelBooking copyBooking = new HotelBooking(manualBooking);
        copyBooking.displayDetails();

        input.close();

    }
}
