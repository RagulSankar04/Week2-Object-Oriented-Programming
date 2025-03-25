import java.util.Scanner;

class Product {
    private String productName;
    private int productPrice;
    private static int totalProducts = 0;

    Product(String product, int price) {
        this.productName = product;
        this.productPrice = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created are: " + totalProducts);
    }

}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Product Name: ");
        String name1 = input.nextLine();
        System.out.print("Enter the Price of the Product: ");
        int price1 = input.nextInt();
        input.nextLine();
        Product p1 = new Product(name1, price1);

        System.out.print("Enter the Second Product Name: ");
        String name2 = input.nextLine();
        System.out.print("Enter the Price of the Product: ");
        int price2 = input.nextInt();
        Product p2 = new Product(name2, price2);

        System.out.println("\n--- Product 1 Details ---");
        p1.displayProductDetails();

        System.out.println("\n--- Product 2 Details ---");
        p2.displayProductDetails();

        System.out.println("\n--- Summary ---");
        Product.displayTotalProducts();

        input.close();
    }
}