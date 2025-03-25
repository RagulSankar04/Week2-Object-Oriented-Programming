import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
    }
}

class Manager extends Employee {
    private String team;

    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Team        : " + team);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = input.nextInt();
        input.nextLine();

        System.out.print("Enter Department: ");
        String dept = input.nextLine();

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        Employee emp = new Employee(empID, dept, salary);
        emp.displayEmployeeDetails();

        System.out.print("\nEnter new Salary to update: ");
        double newSalary = input.nextDouble();
        emp.setSalary(newSalary);
        emp.displayEmployeeDetails();

        input.nextLine();
        System.out.print("\nEnter Manager's Team Name: ");
        String team = input.nextLine();

        Manager mgr = new Manager(empID + 1, dept, newSalary, team);
        mgr.displayManagerDetails();

        input.close();
    }
}
