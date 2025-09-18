class Vehicle {
    static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aarohi", "Car", "UP32AB1234");
        Vehicle v2 = new Vehicle("Divyam", "Bike", "UP32XY5678");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        System.out.println("\nUpdating Registration Fee to ₹6000...\n");
        Vehicle.updateRegistrationFee(6000);

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}
