package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPal = new PayPalAdapter(new PayPalService());
        payPal.pay(100);

        PaymentProcessor phonePe = new PhonePeAdapter(new PhonePeService());
        phonePe.pay(200);
    }
}
