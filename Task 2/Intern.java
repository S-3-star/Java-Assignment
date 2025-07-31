public class Intern extends Employee implements TaxPayer {
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " assists teams and learns.");
    }

    @Override
    public double calculateTax() {
        return 0; // interns don’t pay tax
    }
}

