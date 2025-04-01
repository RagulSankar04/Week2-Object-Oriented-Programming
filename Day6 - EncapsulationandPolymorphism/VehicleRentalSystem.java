import java.util.*;

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): ₹" + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicy = "CAR123POLICY";

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500;
    }

    public double calculateInsurance() {
        return 1500.0;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicy;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicy = "BIKE123POLICY";

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 300.0;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicy;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicy = "TRUCK123POLICY";

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 2000;
    }

    public double calculateInsurance() {
        return 2500.0;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicy;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("TN10CAR001", 1500));
        vehicles.add(new Bike("TN10BIKE002", 500));
        vehicles.add(new Truck("TN10TRUCK003", 3000));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("-------- Vehicle Info --------");
            v.displayVehicle();
            double rentalCost = v.calculateRentalCost(rentalDays);
            double insurance = (v instanceof Insurable) ? ((Insurable) v).calculateInsurance() : 0.0;
            System.out.println("Rental Cost for " + rentalDays + " days: ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insurance);
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("------------------------------\n");
        }
    }
}
