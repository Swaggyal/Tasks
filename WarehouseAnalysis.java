public class WarehouseAnalysis {
    public static  void main(String[] args){
        double[] weights = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};
        String classification = " ";
        double total = 0;
        double average = 0;
        int heavy = 0;
        int med = 0;
        int light = 0;
        double heaviestBox = weights[0];
        int heaviestIndex = 0;

        System.out.println("======CLASSIFICATION LIST======");
        for (int i=0; i < weights.length; i++){
            total += weights[i];
            if(weights[i] > 50.0){
                classification = "Heavy";
                heavy ++;
            }
            else if(weights[i] >= 20 && weights[i] <= 50){
                classification = "Medium";
                med ++;
            }
            else if(weights[i] < 20){
                classification = "Light";
                light ++;
            }

            if(weights[i] > heaviestBox){
                heaviestBox = weights[i];
                heaviestIndex = i;
            }
            average = total / weights.length;
            System.out.println("The index of this box is " + i);
            System.out.println("The classification of box is " + classification);
        }

        System.out.println();
        System.out.println("========SUMMARY========");
        System.out.println("The total weight of all boxes is "+ total +"kg");
        System.out.println("The average weight of the shipment is "+ average +"kg");
        System.out.println("Counts for each category: ");
        System.out.println("Light: "+ light);
        System.out.println("Medium: "+ med);
        System.out.println("Heavy: "+ heavy);
        System.out.println("Details for heaviest box found: ");
        System.out.println("Heaviest box weight: "+ heaviestBox + "kg");
        System.out.println("Heaviest box position: "+ heaviestIndex);


    }
}
