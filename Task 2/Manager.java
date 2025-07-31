public class Manager extends Employee implements TaxPayer {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " manages the team and projects.");
    }

    @Override
    public double calculateTax() {
        return salary * 0.20; // 20% tax for managers
    }
}

