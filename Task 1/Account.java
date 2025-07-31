public class Account {
    private int accountNumber;
    private Customer customer;
    private double balance;

    // Constructor with full parameters
    public Account(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor with default balance
    public Account(int accountNumber, Customer customer) {
        this(accountNumber, customer, 100000.0); // default balance
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Balance: Rs. " + balance);
    }
}
