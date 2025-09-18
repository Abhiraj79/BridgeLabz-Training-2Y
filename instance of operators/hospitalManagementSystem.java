class Patient {
    static String hospitalName = "City Care Hospital";
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAilment() {
        return ailment;
    }
    public int getPatientID() {
        return patientID;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Aarohi", 22, "Fever", 201);
        Patient p2 = new Patient("Divyam", 25, "Fracture", 202);
        Patient p3 = new Patient("Kavya", 30, "Allergy", 203);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
        System.out.println();
        p3.displayDetails();

        System.out.println();
        Patient.getTotalPatients();
    }
}
