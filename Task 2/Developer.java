public class Developer extends Employee implements TaxPayer {
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " writes and tests code.");
    }

    @Override
    public double calculateTax() {
        return salary * 0.15; // 15% tax for developers
    }
}

