class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Type: Car\n");
    }
}

class Truck extends Vehicle {
    Double loadCapacity;

    Truck(int maxSpeed, String fuelType, Double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Type: Truck\n");
    }
}

class Motorcycle extends Vehicle {
    boolean hasStorageBox;

    Motorcycle(int maxSpeed, String fuelType, boolean hasStorageBox) {
        super(maxSpeed, fuelType);
        this.hasStorageBox = hasStorageBox;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Storage Box: " + (hasStorageBox ? "Yes" : "No"));
        System.out.println("Type: Motorcycle\n");
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        System.out.println("Vehicle Details: \n");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
