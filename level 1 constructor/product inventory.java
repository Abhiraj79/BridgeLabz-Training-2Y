class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String n, double p) {
        productName = n;
        price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Notebook", 50);
        Product p3 = new Product("Bag", 500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
