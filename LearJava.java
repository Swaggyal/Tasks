public class LearJava{
    public static void main( String[] args){
        //Primitive data types
        int n = 50;
        float t = 30.5f;
        char c = 'A';

        //Non-Primitive data types
        String str ="Hello Bobo";
        int[] num = {1,2,3,4,5};  //Array

        //----------Output----------
        System.out.println("int: "+ n);
        System.out.println("float: "+ t);
        System.out.println("char: "+ c);
        System.out.println("string: "+ str);

        System.out.print("Array: ");
        for(int j : num){
            System.out.print(j + " ");
        }
        System.out.println();

        //for loop
        System.out.println("For loop: ");
        for(int i=0; i<5; i++){
            System.out.println(i + " ");
        }
        //while loop
        System.out.print("While loop: ");
        int k = 3;
        while(k < 6){
            System.out.print("0" + " ");
            k++;
        }
        //Do-While loop
        // 3. Do-While loop
        System.out.println("\nDo-While Loop:");
        int s = 1;
        do {
            System.out.println("s = " + s);
            s++;
        } while (s <= 5);




    }

}