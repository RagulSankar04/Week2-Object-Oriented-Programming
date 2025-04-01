import java.util.*;

interface MedicalRecord {
    void addRecord(String record);

    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient inPatient = new InPatient("P101", "Ravi Kumar", 45, 5, 1500);
        OutPatient outPatient = new OutPatient("P102", "Sneha Reddy", 29, 500);

        inPatient.addRecord("Admitted for fever and dehydration");
        inPatient.addRecord("IV fluids administered");

        outPatient.addRecord("Routine check-up");
        outPatient.addRecord("Blood test recommended");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            System.out.println("----- Patient Details -----");
            patient.getPatientDetails();
            System.out.println("Bill Amount: ₹" + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
            }
            System.out.println("----------------------------\n");
        }
    }
}
