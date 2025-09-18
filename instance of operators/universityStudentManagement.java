class Student {
    static String universityName = "ABC University";
    private String name;
    private final int rollNumber;
    private String grade;
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getGrade() {
        return grade;
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Aarohi", 101, "A");
        Student student2 = new Student("Divyam", 102, "B");
        Student student3 = new Student("Kavya", 103, "A+");

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student3.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\nUpdating Grade...");
        student2.updateGrade("A");

        System.out.println();
        student2.displayStudentDetails();
    }
}
