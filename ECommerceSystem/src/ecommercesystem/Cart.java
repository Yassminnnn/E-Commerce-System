package ecommercesystem;
class Cart {
    private int customerId;
    private int nProducts;
    private Product products[];
    
    public Cart(int customerId, int nProducts, Product[] products){
        this.customerId = customerId;
        this.nProducts = nProducts;
        this.products = products;
    }
    
    public void setCustomerId(int customerId) {
        customerId=Math.abs(customerId);
        this.customerId = customerId;
    }
    public void setnProducts(int nProducts) {
        nProducts=Math.abs(nProducts);
        this.nProducts = nProducts;
    }
    public void setProducts(Product products[]){
        this.products = new Product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getnProducts() {
        return nProducts;
    }
    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product p, int index) {
        
        if (index >= 0 && index < nProducts)
            products[index] = p;
        else
            System.out.println("Invalid");      
    }

    public void removeProduct(int index){
    if (index >= 0 && index < nProducts)
            products[index] = null;
        else
            System.out.println("Invalid");
    }
    
    
    public float CalculatePrice(){
    float price=0;
    for (int i=0; i<nProducts; i++){
        price += products[i].getPrice();
    }
    return price;
    }
    public void placeOrder(){
    Order o = new Order(customerId, 1, products, CalculatePrice());
        }
}
