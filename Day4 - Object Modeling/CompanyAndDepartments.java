import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName) {
        for (Department dept : departments) {
            if (deptName.equals(deptName)) {
                dept.addEmployee(empName);
                return;
            }
        }
        System.out.println("Department not found: " + deptName);
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    public void deleteCompany() {
        departments.clear();
        System.out.println("Company " + name + " and all its departments and employees have been deleted.");
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("HR");
        company.addDepartment("Development");

        company.addEmployeeToDepartment("HR", "Alice");
        company.addEmployeeToDepartment("Development", "Bob");
        company.addEmployeeToDepartment("Development", "Charlie");

        company.showStructure();

        System.out.println("\n--- Deleting Company ---");
        company.deleteCompany();
    }
}
