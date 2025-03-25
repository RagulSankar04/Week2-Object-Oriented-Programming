import java.util.Scanner;

class Course {
    private String courseName;
    private int courseDuration;
    private int courseFees;
    private static String instituteName = "Default Institute";

    Course(String name, int duration, int fees) {
        this.courseName = name;
        this.courseDuration = duration;
        this.courseFees = fees;
    }

    void displayCourseDetails() {
        System.out.println("\nCourse Name     : " + courseName);
        System.out.println("Duration        : " + courseDuration + " weeks");
        System.out.println("Fee             : $" + courseFees);
        System.out.println("Institute Name  : " + instituteName);
    }

    static void updateInstituteName(String str) {
        instituteName = str;
    }

}

public class onlineCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Institute Name: ");
        String instName = input.nextLine();
        Course.updateInstituteName(instName);

        System.out.print("Enter the Course1 Name: ");
        String name1 = input.nextLine();
        System.out.print("Enter the Duration of the course1(in weeks): ");
        int duration1 = input.nextInt();
        System.out.print("Enter the Fees of the course1: ");
        int fee1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter the Course2 Name: ");
        String name2 = input.nextLine();
        System.out.print("Enter the Duration of the course2(in weeks): ");
        int duration2 = input.nextInt();
        System.out.print("Enter the Fees of the course2: ");
        int fee2 = input.nextInt();
        input.nextLine();

        Course c1 = new Course(name1, duration1, fee1);
        Course c2 = new Course(name2, duration2, fee2);

        System.out.println("\n--- Course 1 Details ---");
        c1.displayCourseDetails();

        System.out.println("\n--- Course 2 Details ---");
        c2.displayCourseDetails();

        input.close();

    }
}
