import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0 && newCGPA <= 10) {
            this.CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0 and 10.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgradDetails() {
        System.out.println("\n[Postgraduate Student]");
        System.out.println("Name (inherited): " + name);
        System.out.println("Specialization  : " + specialization);
    }
}

public class universityManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();
        input.nextLine();

        Student ugStudent = new Student(roll, name, cgpa);
        ugStudent.displayStudentDetails();

        System.out.print("\nUpdate CGPA: ");
        double newCGPA = input.nextDouble();
        ugStudent.setCGPA(newCGPA);
        ugStudent.displayStudentDetails();

        input.nextLine();

        System.out.print("\nEnter Specialization for Postgraduate Student: ");
        String specialization = input.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(roll + 1, "Alice", 9.2, specialization);
        pgStudent.displayPostgradDetails();

        input.close();
    }
}
