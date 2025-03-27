import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayInfo();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayInfo();
        }
    }

    public void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted. All departments removed.");
    }
}

public class UniversitiesFacultiesDepartments {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        University uni = new University("National University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        System.out.println("\nDeleting University...");
        uni.deleteUniversity();

        System.out.println("\nFaculty still exist independently:");
        f1.displayInfo();
        f2.displayInfo();
    }
}
