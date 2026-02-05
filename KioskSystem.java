import java.util.Scanner;

public class KioskSystem {
    public static void main(String[] args){
        int choice;
        int burgerCount = 0;
        int friesCount = 0;
        int totalItemCount = 0;
        double totalCost = 0;
        double burgerPrice = 0;
        double friesPrice = 0;
        double totalPrice = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Pick an item to add to cart: ");
            System.out.println("1.Burger: $5.99");
            System.out.println("2.Fries: $2.50");
            System.out.println("3.Checkout");
            choice = sc.nextInt();


            switch(choice){
                case 1:
                    System.out.println("How many do you want to order? ");
                    burgerCount = sc.nextInt();
                    System.out.println("Added "+ burgerCount +" Burgers to cart");
                    burgerPrice = 5.99;
                    if(burgerCount < 0){
                        System.out.println("Error!enter a positive value");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("How many do you want to order? ");
                    friesCount = sc.nextInt();
                    System.out.println("Added "+ friesCount +" Burgers to cart");
                    friesPrice = 2.50;
                    if(friesCount < 0 ){
                        System.out.println("Error!enter a positive value");
                        return;
                    }
                    break;
            }
            totalPrice = burgerPrice +friesPrice;
            totalItemCount = burgerCount + friesCount;
            totalCost = totalPrice * totalItemCount;
        }while (choice != 3);

        System.out.println("----------SUMMARY-----------");
        System.out.printf("Total No. of items purchased: %.2f.\n", totalItemCount);
        System.out.printf("Grand Total cost: %.2f.\n", totalCost);
    }
}
