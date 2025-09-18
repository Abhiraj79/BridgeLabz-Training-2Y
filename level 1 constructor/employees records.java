class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dep, double sal) {
        employeeID = id;
        department = dep;
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        salary = sal;
    }
}

class Manager extends Employee {
    String team;

    Manager(int id, String dep, double sal, String t) {
        super(id, dep, sal);
        team = t;
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "HR", 50000);
        System.out.println(e.employeeID + " " + e.department + " " + e.getSalary());

        e.setSalary(55000);
        System.out.println("Updated Salary: " + e.getSalary());

        Manager m = new Manager(201, "IT", 80000, "Team A");
        System.out.println(m.employeeID + " " + m.department + " " + m.getSalary() + " " + m.team);
    }
}
