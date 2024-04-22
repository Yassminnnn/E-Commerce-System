package ecommercesystem;
class Product {
    protected int ProductId;
    protected String name;
    protected float price;

    public Product(int ProductId, String name, float price) {
        this.ProductId = ProductId;
        this.name = name;
        this.price = price;
    }
    public void setProductId(int ProductId) {
        ProductId=Math.abs(ProductId);
        this.ProductId = ProductId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        price=Math.abs(price);
        this.price = price;
    }
    public int getProductId() {
        return ProductId;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    } 
}
