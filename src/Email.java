public class Email implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Mailing via internet");
    }

    @Override
    public String getServiceName() {
        return "Email";
    }
}
