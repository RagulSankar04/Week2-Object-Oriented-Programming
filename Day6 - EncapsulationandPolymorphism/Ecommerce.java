import java.util.*;

interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class Electronics extends Product implements Taxable {
    private final double taxRate = 0.18;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * taxRate;
    }

    public String getTaxDetails() {
        return "Tax Rate: 18% GST";
    }
}

class Clothing extends Product implements Taxable {
    private final double taxRate = 0.12;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * taxRate;
    }

    public String getTaxDetails() {
        return "Tax Rate: 12% GST";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class Ecommerce {
    public static void printFinalPrice(Product product) {
        System.out.println("------- Product Info -------");
        product.displayProduct();
        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
        double finalPrice = product.getPrice() + tax - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Final Price: ₹" + finalPrice);
        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
        }
        System.out.println("-----------------------------\n");
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics(201, "Smartphone", 25000));
        cart.add(new Clothing(202, "T-Shirt", 1200));
        cart.add(new Groceries(203, "Wheat Flour", 600));

        for (Product product : cart) {
            printFinalPrice(product);
        }
    }
}
