import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public int getOrderId() {
        return orderId;
    }

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId + " by " + customer.getName());
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.getOrderId());
    }

    public void viewOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            o.displayOrder();
            System.out.println();
        }
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Headphones", 150.00);
        Product p3 = new Product("Mouse", 25.00);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Order o1 = new Order(101, c1);
        o1.addProduct(p1);
        o1.addProduct(p3);
        c1.placeOrder(o1);

        Order o2 = new Order(102, c2);
        o2.addProduct(p2);
        c2.placeOrder(o2);

        Order o3 = new Order(103, c1);
        o3.addProduct(p2);
        o3.addProduct(p3);
        c1.placeOrder(o3);

        System.out.println();
        c1.viewOrders();
        c2.viewOrders();
    }
}
