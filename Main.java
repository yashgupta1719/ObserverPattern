// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        paymentManager.registerPaymentListener(() -> System.out.println("Notification Sent"));

        PaymentListener p2 = new PaymentEventLogger();
        paymentManager.registerPaymentListener(p2);

        paymentManager.pay();

        paymentManager.unregisterPaymentListener(p2);

        paymentManager.pay();
    }
}