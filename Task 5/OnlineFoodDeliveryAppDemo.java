
public class OnlineFoodDeliveryAppDemo {
    public static void main(String[] args) {

        // --- Singleton Pattern Demo ---
        System.out.println("--- Singleton Pattern ---");
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("SELECT * FROM orders");

                // --- Factory Pattern Demo ---
        System.out.println("\n--- Factory Pattern ---");
        User customer = UserFactory.createUser("customer");
        System.out.println("Created User: " + customer.getRole());

        User delivery = UserFactory.createUser("delivery");
        System.out.println("Created User: " + delivery.getRole());

        User admin = UserFactory.createUser("admin");
        System.out.println("Created User: " + admin.getRole());

                //----  oberver pattern------
        System.out.println("\n--- Observer Pattern ---");
        Order order = new Order("ORD123");

        CustomerApp c1 = new CustomerApp("Samjhana Tamang");
        CustomerApp c2 = new CustomerApp("Bobin Tamang");

        order.attach(c1);
        order.attach(c2);

        order.setStatus("Placed");
        order.setStatus("Preparing");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");

        System.out.println();

        System.out.println("Role 1: " + customer.getRole());
        System.out.println("Role 2: " + delivery.getRole());
        System.out.println("Role 3: " + admin.getRole());
    }
}
