import java.util.Scanner;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    static private double registrationFee = 1000.0;

    Vehicle(String name, String type) {
        this.ownerName = name;
        this.vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("\nOwner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : INR " + registrationFee);
    }

    static void updateRegistrationFee(double newfee) {
        registrationFee = newfee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new Registration Fee (or 0 to keep default): ");
        double feeInput = input.nextDouble();
        input.nextLine();
        if (feeInput > 0) {
            Vehicle.updateRegistrationFee(feeInput);
        }

        System.out.print("Enter the Vehicle1 Owner Name: ");
        String name1 = input.nextLine();
        System.out.print("Enter the Type of Vehicle1: ");
        String type1 = input.nextLine();

        System.out.print("Enter the Vehicle2 Owner Name: ");
        String name2 = input.nextLine();
        System.out.print("Enter the Type of Vehicle2: ");
        String type2 = input.nextLine();

        Vehicle v1 = new Vehicle(name1, type1);
        Vehicle v2 = new Vehicle(name2, type2);

        System.out.println("\n--- Vehicle 1 Details ---");
        v1.displayVehicleDetails();

        System.out.println("\n--- Vehicle 2 Details ---");
        v2.displayVehicleDetails();

        input.close();
    }
}
