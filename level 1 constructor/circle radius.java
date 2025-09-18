class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.radius);

        Circle c2 = new Circle(5.5);
        System.out.println("Radius: " + c2.radius);
    }
}
