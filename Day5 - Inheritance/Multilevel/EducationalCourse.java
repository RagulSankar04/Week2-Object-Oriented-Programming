class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is it Recorded ? " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    int fees;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fees, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fees = fees;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fees: " + fees);
        System.out.println("Discount: " + discount);
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse study = new PaidOnlineCourse("Fullstack Developer", 6, "Udemy", true, 25000, 5000);
        System.out.println();
        study.displayDetails();
    }
}
