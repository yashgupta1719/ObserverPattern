public class NotificationManager implements PaymentListener {

    public void sendNotification(){
        System.out.println("Notification sent");
    }

    @Override
    public void paymentMade() {
        sendNotification();
    }
}
