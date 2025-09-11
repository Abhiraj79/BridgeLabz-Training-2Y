class Student {
    String name;
    int rollNumber;
    double marks;

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aarohi";
        s1.rollNumber = 101;
        s1.marks = 86;

        Student s2 = new Student();
        s2.name = "Divyam";
        s2.rollNumber = 102;
        s2.marks = 55;

        s1.displayDetails();
        System.out.println("-----------------");
        s2.displayDetails();
    }
}
