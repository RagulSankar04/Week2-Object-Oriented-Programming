import java.util.ArrayList;
import java.util.List;

interface Department {
    void assignDepartment(String deptName);

    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeID;
    private String employeeName;
    private double baseSalary;
    private String department;

    Employee(int empID, String name, double baseSalary) {
        this.employeeID = empID;
        this.employeeName = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    public abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee Details: ");
        System.out.println("-------------------");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Salary: " + calculateSalary());
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department != null ? department : "Not assigned";
    }
}

class FullTimeEmployee extends Employee {
    private int bonus;

    FullTimeEmployee(int empID, String name, double baseSalary, int bonus) {
        super(empID, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int WorkHours;
    private double HourlyRate;

    PartTimeEmployee(int empID, String name, double baseSalary, int WorkHours, double HourlyRate) {
        super(empID, name, baseSalary);
        this.WorkHours = WorkHours;
        this.HourlyRate = HourlyRate;
    }

    @Override
    public double calculateSalary() {
        return WorkHours * HourlyRate;
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1001, "Ragul", 100000, 25000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(1002, "Sankar", 100000, 12, 20);
        pte.assignDepartment("Public Relations");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}