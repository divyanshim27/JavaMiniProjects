package STEPCLASS.week4;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      MovieTicket var1 = new MovieTicket();
      var1.printTicket();
      MovieTicket var2 = new MovieTicket("Inception");
      var2.printTicket();
      MovieTicket var3 = new MovieTicket("Interstellar", 15);
      var3.printTicket();
      MovieTicket var4 = new MovieTicket("Oppenheimer", "INOX", 25, 350.0);
      var4.printTicket();
   }
}
