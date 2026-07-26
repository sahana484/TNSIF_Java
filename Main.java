import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] data = input.split(",");

        TicketBooking ticket = new TicketBooking(
                data[0],
                data[1],
                Integer.parseInt(data[2])
        );

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

        case 1:
            double amount = sc.nextDouble();
            ticket.makePayment(amount);
            break;

        case 2:
            double walletAmount = sc.nextDouble();
            sc.nextLine();
            String walletNumber = sc.nextLine();
            ticket.makePayment(walletNumber, walletAmount);
            break;

        case 3:
            String holderName = sc.nextLine();
            double cardAmount = sc.nextDouble();
            sc.nextLine();
            String cardType = sc.nextLine();
            String ccv = sc.nextLine();
            ticket.makePayment(cardType, ccv, holderName, cardAmount);
            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}