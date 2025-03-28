interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Electric Vehicle\n");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Petrol Vehicle\n");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla Model 3");
        PetrolVehicle honda = new PetrolVehicle(180, "Honda City");

        tesla.displayDetails();
        tesla.charge();

        honda.displayDetails();
        honda.refuel();
    }
}
