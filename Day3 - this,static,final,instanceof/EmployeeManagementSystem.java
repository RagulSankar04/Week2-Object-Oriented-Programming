class Employee {
    static String companyName = "Capgemini";
    final int ID;
    String empName;
    String empDesignation;
    static int totalEmployees = 0;

    Employee(String name, String desig, int ID) {
        this.empName = name;
        this.empDesignation = desig;
        this.ID = ID;
        totalEmployees++;
    }

    static void getTotalEmployees() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Designation: " + empDesignation);
            System.out.println("Employee ID: " + ID);
        } else {
            System.out.println("Invalid book object.");
        }

    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ragul", "Developer", 1001);
        Employee emp2 = new Employee("Sankar", "Designer", 1002);

        Employee.getTotalEmployees();
        System.out.println();

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();

    }
}
