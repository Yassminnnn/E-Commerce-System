package ecommercesystem;
class BookProduct extends Product {
    private String author;
    private String publisher;
    public BookProduct(String author, String publisher, int ProductId, String name, float price) {
        super(ProductId, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
