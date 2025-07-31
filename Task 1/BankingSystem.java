public class BankingSystem {
    public static void main(String[] args) {
        // Creating a bank
        Bank bank = new Bank("Citizen Bank", "Lambagar");

        // Creating customers using constructor overloading
        Customer customer1 = new Customer("Samjhana Tamang", "sam190@gmail.com");
        Customer customer2 = new Customer("Rohini Tamang");

        // Creating accounts
        Account account1 = new Account(1001, customer1, 20000.0);
        Account account2 = new Account(1002, customer2); // uses default balance

        // Displaying data
        bank.displayInfo();
        account1.displayDetails();
        account2.displayDetails();

        // Simulated cleanup
        customer1.close();
        customer2.close();
    }
}
