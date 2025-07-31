public class CustomerApp implements OrderObserver {
    private String name;

    public CustomerApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String orderId, String status) {
        System.out.println("Hello " + name + ", your order " + orderId + " is now: " + status);
    }
}
