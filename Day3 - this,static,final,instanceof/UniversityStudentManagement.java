class Student {
    static String universityName = "Global Tech University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Ragul", 101, "A");
        Student s2 = new Student("Sankar", 102, "B");

        Student.displayTotalStudents();
        System.out.println();

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        s2.updateGrade("A+");
        System.out.println();
        s2.displayStudentDetails();
    }
}
