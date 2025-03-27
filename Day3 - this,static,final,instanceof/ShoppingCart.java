class Product {
    static int discount = 10;
    final int ID;
    String itemName;
    int itemPrice;
    int itemQty;

    Product(String name, int price, int qty, int ID) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemQty = qty;
        this.ID = ID;
    }

    static void updateDiscount(int newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + ID);
            System.out.println("Product Name: " + itemName);
            System.out.println("Price per Unit: $" + itemPrice);
            System.out.println("Quantity: " + itemQty);
            double total = itemPrice * itemQty;
            double discountedTotal = total - (total * discount / 100.0);
            System.out.println("Total after " + discount + "% discount: $" + discountedTotal);
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product item1 = new Product("Rice", 100, 5, 1001);
        Product item2 = new Product("Dhal", 150, 3, 1002);

        Product.updateDiscount(15);
        System.out.println();

        item1.displayProductDetails();
        System.out.println();
        item2.displayProductDetails();
    }
}
