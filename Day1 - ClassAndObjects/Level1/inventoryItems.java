import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    int price;
    int quantity;
    int totalCost;

    Item(int code, String name, int price, int qty) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
        this.totalCost = price * qty;
    }

    void displayDetails() {
        System.out.println("The Total cost for the quantity is: " + totalCost);
    }
}

public class inventoryItems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Quantity: ");
        int qty = input.nextInt();
        System.out.print("Enter the ItemCode: ");
        int code = input.nextInt();
        System.out.print("Enter the ItemName: ");
        String name = input.next();
        System.out.print("Enter the Price: ");
        int price = input.nextInt();

        Item invItem = new Item(code, name, price, qty);
        invItem.displayDetails();

        input.close();
    }
}
