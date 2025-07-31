public class Customer {
    private String name;
    private String email;

    // Overloaded constructors
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Customer(String name) {
        this(name, "Not Provided");
    }

    // Getters for encapsulation
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Simulated destructor (instead of deprecated finalize())
    public void close() {
        System.out.println("Customer object for " + name + " is cleaned up.");
    }
}


