class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        t1.bookTicket("Avengers: Endgame", 12, 250);
        t1.displayDetails();

        System.out.println("-------------------");

        MovieTicket t2 = new MovieTicket();
        t2.bookTicket("Inception", 45, 300);
        t2.displayDetails();
    }
}
