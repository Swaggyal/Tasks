public class MonthlyCombinedSales {
    public static void main(String[] args){
        //Store data in 2D Arrays
        int [][] highStreetBranch = {{42000, 48000, 50000},{52000, 58000, 60000},{46000, 49000, 58000},{50000, 51000, 61000}};

        int [][] mallBranch = {{57000, 63000, 60000},{70000, 67000, 73000},{67000, 65000, 62000},{72000, 69000, 75000}};

        //Monthly Combined Sales
        System.out.println("Monthly Combined Sales: ");
        int index = 0;
        int[] combinedMonths = new int[12]; //store all 12 months

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                int total = highStreetBranch[i][j] + mallBranch[i][j];
                combinedMonths[index++] = total;
                System.out.println("Quarter "+ (i+1)+ " Month "+(j+1)+": "+total);
            }
        }
        //Quarterly sales per shop

        int highStreetAnnual = 0;
        int mallAnnual = 0;

        System.out.println("\nHigh Street Quarterly Totals: ");
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += highStreetBranch[i][j];
            }
            highStreetAnnual += sum;
            System.out.println("Quarter "+(i+1)+": " + sum);
        }

        System.out.println("\nMall Quarterly Totals: ");
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += mallBranch[i][j];
            }
            mallAnnual += sum;
            System.out.println("Quarter "+(i+1)+": " + sum);
        }

        //Combined Quarterly Sales
        System.out.println("\nCombined Quarterly Totals: ");
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += highStreetBranch[i][j] + mallBranch[i][j];
            }
            System.out.println("Quarter "+(i+1)+": " + sum);
        }

        //Annual Sales
        System.out.println("\nHigh Street Annual: " + highStreetAnnual);
        System.out.println("\nMall Annual: " + mallAnnual);
        int grandTotal = highStreetAnnual + mallAnnual;
        System.out.println("\nGrand Annual Total: " +grandTotal);

        //Sort monthly combined sales(Highest to Lowest)
        for(int i=0; i< combinedMonths.length - 1; i++){
            for(int j=0; j< combinedMonths.length -1 -i; j++){
                if(combinedMonths[j] < combinedMonths[j+1]){
                    int temp = combinedMonths[j];
                    combinedMonths[j] = combinedMonths[j+1];
                    combinedMonths[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted Monthly Combined Sales (High to Low): ");
        for(int value : combinedMonths){
            System.out.println(value);
        }
    }
}
