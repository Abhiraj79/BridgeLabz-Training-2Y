class Employee {
    static String companyName = "Tech Solutions Pvt. Ltd.";
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDesignation() {
        return designation;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if(this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aarohi", 101, "Software Engineer");
        Employee e2 = new Employee("Divyam", 102, "Data Analyst");
        Employee e3 = new Employee("Kavya", 103, "Project Manager");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}
