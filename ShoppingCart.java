public class ShoppingCart {
    public static void main(String[] args) {
        //Declare arrays for items and their prices
        String[] items = {"Coke", "Bread", "Flower", "Pillow", "Socks"};
        double[] prices = {25.0, 20.0, 150.5, 80.0, 5.9};
        double total = 0;

        //Looping through items in the array
        System.out.println("---Items in the Shopping cart---");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        //Displaying items number and price
        System.out.println("---Items number and price---");
        for(int i=0; i< prices.length; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(prices[i]);
        }
        for(int i=0; i< prices.length; i++){
        if(prices[i] > 100){
            prices[i] -= 0.10 *prices[i];
            System.out.println("10% discount applied to item number " + (i+1));
        }
        total += prices[i];
        }
        System.out.println("The total amount after all discounts have been applied is "+ total);
    }
}
