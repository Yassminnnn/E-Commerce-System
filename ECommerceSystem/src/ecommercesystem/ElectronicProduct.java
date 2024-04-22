package ecommercesystem;
class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(String brand, int warrantyPeriod, int ProductId, String name, float price) {
        super(ProductId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        warrantyPeriod= Math.abs(warrantyPeriod);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
}