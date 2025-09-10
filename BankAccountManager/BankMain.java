package STEPCLASS.week4;

public class BankMain {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Divyanshi");
        BankAccount a3 = new BankAccount("Bhargav", 5000.0);

        a1.displayAccount();
        a2.deposit(2000);
        a2.withdraw(500);
        a2.displayAccount();

        a3.deposit(1500);
        a3.withdraw(7000);
        a3.displayAccount();
    }
}
