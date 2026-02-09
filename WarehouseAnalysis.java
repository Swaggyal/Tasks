public class WarehouseAnalysis {
    public static  void main(String[] args){
        double[] weights = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};
        String classification = " ";

        for (int i=0; i < weights.length; i++){
            if(weights[i] > 50.0){
                classification = "Heavy";
            }
            else if(weights[i] >= 20 && weights[i] <= 50){
                classification = "Medium";
            }
            else if(weights[i] < 20){
                classification = "Light";
            }
            System.out.println("The index of this box is " + i);
            System.out.println("The classification of box is " + classification);
        }
    }
}
