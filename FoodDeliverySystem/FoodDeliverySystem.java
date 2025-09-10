package STEPCLASS.week4;

public class FoodDeliverySystem {

    static class FoodDelivery {
        String customerName;
        String foodItem;
        int quantity;
        double price;

        static final double FIXED_RATE = 150.0;

        public FoodDelivery() {
            this.customerName = "Unknown";
            this.foodItem = "Unknown";
            this.quantity = 0;
            this.price = 0.0;
        }

        public FoodDelivery(String foodItem) {
            this.customerName = "Guest";
            this.foodItem = foodItem;
            this.quantity = 1;
            this.price = FIXED_RATE;
        }

        public FoodDelivery(String customerName, String foodItem, int quantity) {
            this.customerName = customerName;
            this.foodItem = foodItem;
            this.quantity = quantity;
            this.price = quantity * FIXED_RATE;
        }

        public void printBill() {
            System.out.println("==================================");
            System.out.println("         FOOD DELIVERY BILL       ");
            System.out.println("==================================");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
            System.out.println("Quantity      : " + quantity);
            System.out.println("Price/Item    : Rs " + FIXED_RATE);
            System.out.println("----------------------------------");
            System.out.println("Total Amount  : Rs " + price);
            System.out.println("==================================\n");
        }
    }

    public static void main(String[] args) {
        FoodDelivery order1 = new FoodDelivery("Aarav", "Cheese Burger", 2);
        FoodDelivery order2 = new FoodDelivery("Meera", "Veggie Pizza", 3);
        FoodDelivery order3 = new FoodDelivery("Rohan", "Pasta Alfredo", 1);
        FoodDelivery order4 = new FoodDelivery("Ishita", "Paneer Sandwich", 4);
        FoodDelivery order5 = new FoodDelivery("Kabir", "French Fries", 5);
        FoodDelivery order6 = new FoodDelivery("Ananya", "Spring Rolls", 2);

        order1.printBill();
        order2.printBill();
        order3.printBill();
        order4.printBill();
        order5.printBill();
        order6.printBill();
    }
}
