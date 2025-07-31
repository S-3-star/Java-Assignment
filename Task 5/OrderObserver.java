public interface OrderObserver {
    void update(String orderId, String status);
}
