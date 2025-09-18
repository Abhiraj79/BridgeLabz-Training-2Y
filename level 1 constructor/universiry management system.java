class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        cgpa = c;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double c) {
        cgpa = c;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int r, String n, double c, String s) {
        super(r, n, c);
        specialization = s;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Aarohi", 8.5);
        System.out.println(s.rollNumber + " " + s.name + " " + s.getCgpa());

        PostgraduateStudent p = new PostgraduateStudent(2, "Divyam", 9.2, "AI");
        System.out.println(p.rollNumber + " " + p.name + " " + p.specialization + " " + p.getCgpa());
    }
}
