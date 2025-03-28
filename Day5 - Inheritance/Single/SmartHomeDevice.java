class Device {
    int deviceID;
    String status;

    Device(int deviceID, String Status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceID);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(int deviceID, String status, int temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevice {
    public static void main(String[] args) {
        Device thermostat = new Thermostat(101, "Online", 24);
        thermostat.displayStatus();
    }
}
