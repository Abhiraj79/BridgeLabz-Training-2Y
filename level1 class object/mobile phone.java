   class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "Samsung";
        m1.model = "Galaxy S23";
        m1.price = 79999;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "Apple";
        m2.model = "iPhone 15";
        m2.price = 129999;

        m1.displayDetails();
        System.out.println("-----------------");
        m2.displayDetails();
    }
}
