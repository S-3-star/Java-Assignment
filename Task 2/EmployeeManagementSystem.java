public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Upcasting: Subclass to Superclass
        Employee emp1 = new Manager("Ramita Tamang", 101, 90000);
        Employee emp2 = new Developer("Samjhana Tamang", 102, 60000);
        Employee emp3 = new Intern("Kripa Tamang", 103, 10000);

        // All use overridden method
        emp1.work();
        emp2.work();
        emp3.work();

        // Interface usage
        TaxPayer t1 = (TaxPayer) emp1;
        TaxPayer t2 = (TaxPayer) emp2;
        TaxPayer t3 = (TaxPayer) emp3;

        System.out.println("\n--- Tax Details ---");
        System.out.println(emp1.name + " Tax: Rs. " + t1.calculateTax());
        System.out.println(emp2.name + " Tax: Rs. " + t2.calculateTax());
        System.out.println(emp3.name + " Tax: Rs. " + t3.calculateTax());

        // Downcasting: Superclass to Subclass
        if (emp1 instanceof Manager) {
            Manager m = (Manager) emp1;
            System.out.println("\nDowncasting success: " + m.name + " is a Manager.");
        }
    }
}
