package adapter;

public class PhonePeService {
    public void doPayment(int amount, String clientId) {
        System.out.println("PhonePe payment completed for " + clientId + ": " + amount);
    }
}
