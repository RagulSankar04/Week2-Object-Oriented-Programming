import java.util.Scanner;

class Student {
    String NameOfStudent;
    String RollNoOfStudent;
    int marks;

    Student(String name, String rollNo, int mark) {
        this.NameOfStudent = name;
        this.RollNoOfStudent = rollNo;
        this.marks = mark;
    }

    String calcGrade() {
        if (marks > 90)
            return "O";
        else if (marks >= 81)
            return "A+";
        else if (marks >= 71)
            return "A";
        else if (marks >= 61)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "F";
    }

    void displayResults() {
        System.out.println("Name: " + NameOfStudent);
        System.out.println("Roll No: " + RollNoOfStudent);
        System.out.println("Mark: " + marks);
        System.out.println("Grade: " + calcGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name of the Student: ");
        String name = input.nextLine();
        System.out.print("Enter the Roll Number of the Student: ");
        String rollNo = input.nextLine();
        System.out.print("Enter the Mark of the Student: ");
        int mark = input.nextInt();

        Student grades = new Student(name, rollNo, mark);
        grades.displayResults();
        input.close();
    }

}
