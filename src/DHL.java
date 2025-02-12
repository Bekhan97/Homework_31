public class DHL implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Put the letter in an envelope, put a stamp on it, mail it.");
    }

    @Override
    public String getServiceName() {
        return "DHL";
    }
}
