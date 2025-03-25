import java.util.Scanner;

class CarRental {
    private String CustomerName;
    private String ModelOfTheCar;
    private int RentalDays;
    private int RentalRate;

    CarRental(String name, String model, int days) {
        this.CustomerName = name;
        this.ModelOfTheCar = model;
        this.RentalDays = days;
        this.RentalRate = getRentalRate(model);
    }

    private int getRentalRate(String model) {
        if (model.equalsIgnoreCase("Sedan")) {
            return 100;
        } else if (model.equalsIgnoreCase("SUV")) {
            return 150;
        } else if (model.equalsIgnoreCase("Hatchback")) {
            return 80;
        } else if (model.equalsIgnoreCase("Convertible")) {
            return 200;
        } else {
            return 100;
        }
    }

    int totalCost() {
        return RentalDays * RentalRate;
    }

    void displayDetails() {
        System.out.println("\nCar Rental");
        System.out.println("------------------");
        System.out.println("Customer's Name: " + CustomerName);
        System.out.println("Car's Model: " + ModelOfTheCar);
        System.out.println("No Of Days: " + RentalDays);
        System.out.println("The Total Cost: " + totalCost());
    }
}

public class RentalCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Customer's Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Car's Model: ");
        String model = input.nextLine();
        System.out.print("Enter the no of days: ");
        int days = input.nextInt();

        CarRental myRental = new CarRental(name, model, days);
        myRental.displayDetails();

        input.close();
    }
}
