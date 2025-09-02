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

   public MovieTicket(String var1) {
      this.movieName = var1;
      this.theatreName = "Unknown";
      this.seatNumber = 0;
      this.price = 200.0;
   }

   public MovieTicket(String var1, int var2) {
      this.movieName = var1;
      this.seatNumber = var2;
      this.theatreName = "PVR";
      this.price = 0.0;
   }

   public MovieTicket(String var1, String var2, int var3, double var4) {
      this.movieName = var1;
      this.theatreName = var2;
      this.seatNumber = var3;
      this.price = var4;
   }

   public void printTicket() {
      System.out.println("Movie Ticket");
      System.out.println("Movie Name   : " + this.movieName);
      System.out.println("Theatre Name : " + this.theatreName);
      System.out.println("Seat Number  : " + this.seatNumber);
      System.out.println("Price        : Rs " + this.price);
      System.out.println("-------------------------------");
   }
}
