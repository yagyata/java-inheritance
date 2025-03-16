class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Status: Order Placed");
    }

    public void orderDetails(){
        System.out.println("Order ID: " + orderId + "\nOrder Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Status: Order shipped, The tracking number is: " + trackingNumber);
    }

    @Override
    public void orderDetails() {
        super.orderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Status: Order delivered on " + deliveryDate);
    }

    @Override
    public void orderDetails() {
        super.orderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineOrderManagement {
    public static void main(String[] args) {
        ShippedOrder shipped = new ShippedOrder(465163, "14/03/2025", "158863");
        shipped.getOrderStatus();

        System.out.println();

        DeliveredOrder delivered = new DeliveredOrder(476520, "14/03/2025", "87645", "17/03/2025");
        delivered.orderDetails();
        delivered.getOrderStatus();

    }
}
