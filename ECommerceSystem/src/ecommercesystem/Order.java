package ecommercesystem;
class Order {
    private int CustomerId;
    private int orderId;
    private Product products[];
    float totalPrice;
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
    this.CustomerId = customerId;
    this.orderId = orderId;
    this.products = products;
    this.totalPrice = totalPrice;
    }
    public void setCustomerId(int CustomerId) {
        CustomerId = Math.abs(CustomerId);
        this.CustomerId = CustomerId;
    }
    public void setOrderId(int orderId) {
        orderId = Math.abs(orderId);
        this.orderId = orderId;
}
    public void setTotalPrice(float totalPrice) {
        totalPrice = Math.abs(totalPrice);
        this.totalPrice = totalPrice;
    }
    public int getCustomerId() {
        return CustomerId;
    }
    public int getOrderId() {
        return orderId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
   public void printOrderInfo(){
       System.out.println("Here's your order's summary: ");
       System.out.println("Order ID: " + orderId);
       System.out.println("Customer ID: " + CustomerId);
       System.out.println("Products: ");
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }
        System.out.println("Total price: " + totalPrice);
   } 
}
