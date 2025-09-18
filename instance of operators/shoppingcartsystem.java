class Product {
    static double discount = 5.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double totalPrice = (price * quantity) - (price * quantity * discount / 100);
            System.out.println("Total Price after discount: ₹" + totalPrice);
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 60000, 1);
        Product p2 = new Product(202, "Headphones", 2000, 2);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println("\nUpdating Discount to 10%...\n");
        Product.updateDiscount(10);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}
