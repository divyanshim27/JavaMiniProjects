package STEPCLASS.week4;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.printTicket();

        MovieTicket ticket2 = new MovieTicket("Inception");
        ticket2.printTicket();

        MovieTicket ticket3 = new MovieTicket("Interstellar", 15);
        ticket3.printTicket();

        MovieTicket ticket4 = new MovieTicket("Oppenheimer", "INOX", 25, 350.00);
        ticket4.printTicket();
    }
}
