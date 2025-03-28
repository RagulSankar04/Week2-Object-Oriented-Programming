class Employee {
    String empName;
    int ID;
    Double salary;

    Employee(String name, int ID, Double salary) {
        this.empName = name;
        this.ID = ID;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + empName);
        System.out.println("ID: " + ID);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int ID, double salary, int teamSize) {
        super(name, ID, null);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager\n");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer\n");
    }
}

class Intern extends Employee {
    int internshipDuration; // in months

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
        System.out.println("Role: Intern\n");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 85000, 10);
        Developer developer = new Developer("Bob", 102, 70000, "Java");
        Intern intern = new Intern("Charlie", 103, 15000, 6);

        System.out.println("Employee Details:\n");
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
