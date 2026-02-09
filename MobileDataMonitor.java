import java.util.Scanner;

public class MobileDataMonitor {
    public static void main(String[] args){

        //Initial state
        double balance = 20.0;
        double totalDataUsed = 0.0;

        Scanner sc = new Scanner(System.in);

        //Monitoring loop
        while(balance > 0){
            System.out.print("Enter amount of data used in current session:(GB) ");
            double dataUsed = sc.nextDouble();

            //Input validation
            if(dataUsed < 0){
                System.out.println("Invalid entry!enter a positive value");
                continue;   //skip rest and ask again
            }

            //Processing
            balance -= dataUsed;
            totalDataUsed += dataUsed;

            if(balance > 5.0){
                System.out.println("Data balance is sufficient");
            }
            else if(balance > 1 &&  balance < 5){
                System.out.println("Warning: Data balance is low");
            }
            else if(balance > 0 && balance < 1){
                System.out.println("Critical: Data almost exhausted");
            }
            else if(balance <= 0){
                System.out.println("Data exhausted. Internet disconnected");
            }

            System.out.printf("Remaining balance: %.2f GB\n", Math.max(balance, 0));
            System.out.println();
        }

        //Final summary
        System.out.printf("Total data used is %.2f GB", totalDataUsed );
        System.out.println();
        System.out.printf("Final balance is %.2f GB\n", Math.max(balance, 0));

        sc.close();
    }
}
