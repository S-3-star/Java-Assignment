import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("Order " + orderId + " status changed to: " + status);
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderId, status);
        }
    }
}
