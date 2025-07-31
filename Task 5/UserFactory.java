
public class UserFactory {
    public static User createUser(String type) {
        if (type.equalsIgnoreCase("customer")) {
            return new Customer();
        } else if (type.equalsIgnoreCase("delivery")) {
            return new DeliveryPerson();
        } else if (type.equalsIgnoreCase("admin")) {
            return new Admin();
        } else {
            throw new IllegalArgumentException("Invalid user type");
        }
    }
}
