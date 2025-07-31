public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work(); // abstract method

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs. " + salary);
    }
}

