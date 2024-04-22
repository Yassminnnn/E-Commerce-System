package ecommercesystem;
import java.util.Scanner;
public class ECommerceSystem {

    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
ElectronicProduct e1= new ElectronicProduct("Samsung", 1, 1, "smartphone", (float)599.9);
ClothingProduct cloth1 = new ClothingProduct("Medium", "Cotton", 2, "T-shirt", (float)19.99);
BookProduct b1= new BookProduct("O’Reilly", "X Publications", 3, "OOP", (float)39.99);

System.out.println("Welcome to the E-Commerce system!");
System.out.println("Please enter your id ");
int id= input.nextInt();
System.out.println("Please enter your name ");
String n = input.next();
System.out.println("Please enter your address ");
String a = input.next();
Customer cust1= new Customer(id, n, a);

        System.out.println("How many products do you want to add to your cart? ");
        int nProducts= input.nextInt();
        Product[] products = new Product[nProducts];
        Cart c1= new Cart(id, nProducts, products);


        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int productId = input.nextInt();
            switch (productId) {
                case 1:
                    c1.addProduct(e1, i);
                    break;
                case 2:
                    c1.addProduct(cloth1, i);
                    break;
                case 3:
                    c1.addProduct(b1, i);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        
    }   
 
    Order o1 = new Order(cust1.getCustomerId(), 1, c1.getProducts(), c1.CalculatePrice());
System.out.println("Your total is: " + c1.CalculatePrice() + "Would you like to place the order? 1-Yes 2-No");
  int x=input.nextInt();
  if (x == 1) {
    o1.printOrderInfo();
} else {
    System.out.println("Order not placed");
}
    }
    
}
