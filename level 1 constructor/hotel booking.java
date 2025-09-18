class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        System.out.println(b1.guestName + " " + b1.roomType + " " + b1.nights);

        HotelBooking b2 = new HotelBooking("Aarohi", "Deluxe", 3);
        System.out.println(b2.guestName + " " + b2.roomType + " " + b2.nights);

        HotelBooking b3 = new HotelBooking(b2);
        System.out.println(b3.guestName + " " + b3.roomType + " " + b3.nights);
    }
}
