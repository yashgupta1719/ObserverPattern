public class PaymentEventLogger implements PaymentListener {
    public void logEvent(){
        System.out.println("Payment received");
    }


    @Override
    public void paymentMade() {
        logEvent();
    }
}
