import java.util.Scanner;

class MobilePhone {
    String BrandOfMobile;
    String ModelOfMobile;
    int PriceOfMobile;

    MobilePhone(String brand, String model, int price) {
        this.BrandOfMobile = brand;
        this.ModelOfMobile = model;
        this.PriceOfMobile = price;
    }

    void displayResults() {
        System.out.println("The Brand of the Mobile Phone is " + BrandOfMobile + " and the Model is " + ModelOfMobile
                + " and the Price is " + PriceOfMobile);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Brand: ");
        String brand = input.nextLine();
        System.out.print("Enter the Model: ");
        String model = input.nextLine();
        System.out.print("Enter the Price: ");
        int price = input.nextInt();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayResults();
        input.close();
    }
}
