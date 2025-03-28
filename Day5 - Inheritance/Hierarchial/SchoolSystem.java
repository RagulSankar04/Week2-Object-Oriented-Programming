    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayBasicInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    class Teacher extends Person {
        String subject;

        Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        void displayRole() {
            displayBasicInfo();
            System.out.println("Subject: " + subject);
            System.out.println("Role: Teacher\n");
        }
    }

    class Student extends Person {
        String grade;

        Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }

        void displayRole() {
            displayBasicInfo();
            System.out.println("Grade: " + grade);
            System.out.println("Role: Student\n");
        }
    }

    class Staff extends Person {
        String department;

        Staff(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }

        void displayRole() {
            displayBasicInfo();
            System.out.println("Department: " + department);
            System.out.println("Role: Staff\n");
        }
    }

    public class SchoolSystem {
        public static void main(String[] args) {
            Teacher teacher = new Teacher("Mrs. Smith", 40, "Mathematics");
            Student student = new Student("John Doe", 16, "10th Grade");
            Staff staff = new Staff("Mr. Allen", 35, "Administration");

            teacher.displayRole();
            student.displayRole();
            staff.displayRole();
        }
    }
