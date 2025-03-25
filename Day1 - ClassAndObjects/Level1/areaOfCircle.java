import java.util.Scanner;

class Area {
    double radius;
    double area;
    double circumference;

    Area(double radius) {
        this.radius = radius;
        this.area = 3.14 * radius * radius;
        this.circumference = 2 * 3.14 * radius;
    }

    void displayDetails() {
        System.out.println("The Area of the Circle is: " + area);
        System.out.println("The Circumference of the Circle is: " + circumference);
    }
}

class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double radius = input.nextDouble();
        Area areaOfCircle = new Area(radius);
        areaOfCircle.displayDetails();
        input.close();
    }
}
