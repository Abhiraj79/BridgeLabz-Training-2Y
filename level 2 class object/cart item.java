class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart");
    }

    void displayTotalCost() {
        double total = price * quantity;
        if (!itemName.equals("")) {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + total);
        } else {
            System.out.println("Cart is empty");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Book", 200, 3);
        cart.displayTotalCost();
        cart.removeItem();
        cart.displayTotalCost();
    }
}
