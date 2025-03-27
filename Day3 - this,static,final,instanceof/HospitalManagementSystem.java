class Patient {
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ragul", 25, "Fever", 2001);
        Patient p2 = new Patient("Anita", 30, "Fracture", 2002);

        Patient.getTotalPatients();
        System.out.println();

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
    }
}
