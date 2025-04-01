import java.util.*;

interface Discountable {
    void applyDiscount(double percent);

    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    public String getDiscountDetails() {
        return discount + "% discount applied";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 30;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity() + extraCharge;
        return baseTotal - (baseTotal * discount / 100);
    }

    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    public String getDiscountDetails() {
        return discount + "% discount applied (includes ₹" + extraCharge + " non-veg charge)";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();
        FoodItem veg = new VegItem("Paneer Butter Masala", 180, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 1);

        if (veg instanceof Discountable) {
            ((Discountable) veg).applyDiscount(10);
        }
        if (nonVeg instanceof Discountable) {
            ((Discountable) nonVeg).applyDiscount(5);
        }

        orderList.add(veg);
        orderList.add(nonVeg);

        for (FoodItem item : orderList) {
            System.out.println("----- Food Item -----");
            item.getItemDetails();
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println("----------------------\n");
        }
    }
}
