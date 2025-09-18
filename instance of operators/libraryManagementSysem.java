class Book {
    static String libraryName = "Central Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if(this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "ISBN002");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}
