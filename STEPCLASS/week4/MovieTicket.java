package STEPCLASS.week4;

public class MovieTicket {
    private String movieName;
    private String theatreName;
    private int seatNumber;
    private double price;

    public MovieTicket() {
        this.movieName = "Unknown";
        this.theatreName = "Unknown";
        this.seatNumber = 0;
        this.price = 0.0;
    }

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.theatreName = "Unknown";
        this.seatNumber = 0;
        this.price = 200.0;
    }

    public MovieTicket(String movieName, int seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.theatreName = "PVR";
        this.price = 0.0;
    }

    public MovieTicket(String movieName, String theatreName, int seatNumber, double price) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Movie Ticket");
        System.out.println("Movie Name   : " + movieName);
        System.out.println("Theatre Name : " + theatreName);
        System.out.println("Seat Number  : " + seatNumber);
        System.out.println("Price        : Rs " + price);
        System.out.println("-------------------------------");
    }
}
