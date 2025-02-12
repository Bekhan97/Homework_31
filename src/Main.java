import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MailDeliveryService[] mailDeliveryServices = {
                new DHL(),
                new Email(),
                new Pigeon()
        };

        MailDeliveryService mailDeliveryService = menu(mailDeliveryServices, scanner);
        System.out.printf("Delivery service %s: ", mailDeliveryService.getServiceName());
        mailDeliveryService.sendMail();

    }

    public static MailDeliveryService menu(MailDeliveryService[] mailDeliveryServices, Scanner scanner) {
        System.out.println("Choose option to send mail [1.." + mailDeliveryServices.length + "]");
        for (int i = 0; i < mailDeliveryServices.length; i++) {
            MailDeliveryService mailDeliveryService = mailDeliveryServices[i];
            System.out.printf("%d. %s %n", i + 1, mailDeliveryService.getServiceName());
        }
        System.out.print("Enter a number to choose: ");
        int select = scanner.nextInt() - 1;
        return mailDeliveryServices[select];
    }
}