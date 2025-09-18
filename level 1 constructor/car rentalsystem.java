class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int costPerDay = 1000;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    int totalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        System.out.println(r1.customerName + " " + r1.carModel + " " + r1.rentalDays + " " + r1.totalCost());

        CarRental r2 = new CarRental("Aarohi", "SUV", 5);
        System.out.println(r2.customerName + " " + r2.carModel + " " + r2.rentalDays + " " + r2.totalCost());
    }
}
