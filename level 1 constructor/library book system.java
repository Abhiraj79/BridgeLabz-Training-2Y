class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is not available");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 300, true);
        System.out.println(b1.title + " " + b1.author + " " + b1.price + " " + b1.available);

        b1.borrowBook();
        b1.borrowBook();
    }
}
