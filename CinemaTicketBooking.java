import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {
        int ticketCount = 0;
        double totalCost = 0;
        int choice = 0;
        double amount = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Select an option");
            System.out.println("=====TICKET CATEGORIES=====");
            System.out.println("Option 1: 25cedis");
            System.out.println("Option 2: 15cedis");
            System.out.println("Option 3: 50cedis");
            System.out.println("Option 4: Finish booking");
            choice = sc.nextInt();

            if(choice < 1 && choice > 4){
                System.out.println("Invalid option");
                break;
            }
            switch(choice){
                case 1:
                    amount = 25;
                    break;
                case 2:
                    amount = 15;
                    break;
                case 3:
                    amount = 50;
                    break;
                case 4:
                    amount = 0;
                    break;
            }

            if(choice >= 1 || choice <= 4){
                ticketCount ++;
                totalCost += amount;
            }
        } while (choice != 4);

        System.out.println("======SUMMARY======");
        if(ticketCount == 0){
            System.out.println("No tickets booked");
        } else if (ticketCount >=1 && ticketCount <=3) {
            System.out.println("Standard Booking");
        }else if(ticketCount > 3){
            System.out.println("Group Booking");
        }
        System.out.println("Total ticket count is: " + ticketCount);
        System.out.println("Total Cost of tickets is: " + totalCost);
    }
}
