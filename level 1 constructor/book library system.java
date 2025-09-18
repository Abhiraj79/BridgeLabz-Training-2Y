class Book {
    public int ISBN;
    protected String title;
    private String author;

    Book(int i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }
}

class EBook extends Book {
    String format;

    EBook(int i, String t, String a, String f) {
        super(i, t, a);
        format = f;
    }

    public static void main(String[] args) {
        Book b = new Book(101, "Java Basics", "James");
        System.out.println(b.ISBN + " " + b.title + " " + b.getAuthor());

        EBook e = new EBook(102, "Python Guide", "Guido", "PDF");
        System.out.println(e.ISBN + " " + e.title + " " + e.getAuthor() + " " + e.format);
    }
}
