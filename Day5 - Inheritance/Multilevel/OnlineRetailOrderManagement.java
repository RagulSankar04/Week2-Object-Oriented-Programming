class Order {
    int orderID;
    String orderdate;

    Order(int orderID, String date) {
        this.orderID = orderID;
        this.orderdate = date;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderdate);
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    ShippedOrder(int orderID, String Date, int trackingNumber) {
        super(orderID, Date);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderID, String Date, int trackingNumber, String deliveryDate) {
        super(orderID, deliveryDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "2025-04-08", 987654321, "2025-04-10");

        System.out.println("Order Status:\n");
        order.getOrderStatus();
    }
}