import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out
                .println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CartItem item1 = null, item2 = null;

        while (true) {
            System.out.println("\n1. Add Item 1");
            System.out.println("2. Add Item 2");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName1 = input.nextLine();
                    System.out.print("Enter Price: ");
                    double price1 = input.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity1 = input.nextInt();
                    item1 = new CartItem(itemName1, price1, quantity1);
                    break;
                case 2:
                    System.out.print("Enter Item Name: ");
                    String itemName2 = input.nextLine();
                    System.out.print("Enter Price: ");
                    double price2 = input.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity2 = input.nextInt();
                    item2 = new CartItem(itemName2, price2, quantity2);
                    break;
                case 3:
                    System.out.println("\nShopping Cart:");
                    double total = 0;
                    if (item1 != null) {
                        item1.displayItem();
                        total += item1.getTotalCost();
                    }
                    if (item2 != null) {
                        item2.displayItem();
                        total += item2.getTotalCost();
                    }
                    System.out.println("Total Cart Cost: " + total);
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
