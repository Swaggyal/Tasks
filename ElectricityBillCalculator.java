import java.util.Scanner;

public class ElectricityBillCalculator {
    final static double costPerKwh = 0.20;

    static double calcBaseCost(double consumption){
        double baseCost = consumption * costPerKwh;
        return baseCost;
    }
public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the total number of Appliances: ");
    int n = input.nextInt();
    double[] numOfAppliances = new double[n];
    double[] cost = new double[n];
    double totalConsumption =0;
    double totalCost = 0;

    System.out.println("Enter the consumption of each Appliance(kWh): ");
    for (int i = 0; i < numOfAppliances.length; i++) {
        double consumption = input.nextInt();
        numOfAppliances[i] = consumption;
        cost[i] = calcBaseCost(consumption);
        totalConsumption += consumption;

        if(consumption > 100){
            cost[i] -= 0.15 * cost[i];
            totalCost += cost[i];
        }
    }
    for(int j=0; j<numOfAppliances.length; j++){
        System.out.println("========" + "No. "+ (j+1) + "========");
        System.out.println(" kWh used is: " + numOfAppliances[j]);
        System.out.println(" Final cost is: " + cost[j]);
        if(calcBaseCost(numOfAppliances[j]) != cost[j]){
            System.out.println("Surcharge was applied!");
        }
    }
    System.out.println();
    System.out.println(" Total Consumption is: " + totalConsumption);
    System.out.println(" Total cost is: " + totalCost);
}
}