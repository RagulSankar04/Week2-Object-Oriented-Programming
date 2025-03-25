import java.util.Scanner;

class Circle {
    private double radius;
    private double area;

    Circle() {
        this(5);
    }

    Circle(double radiusInput) {
        this.radius = radiusInput;
        this.area = calcArea();
    }

    double calcArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    void displayResults() {
        System.out.println("The Area of the Circle with Radius " + radius + " is: " + area);
    }
}

public class CircleRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double radiusInput = input.nextDouble();

        Circle radDef = new Circle(radiusInput);
        radDef.displayResults();

        Circle radPara = new Circle();
        radPara.displayResults();

        input.close();
    }
}
