import java.util.Scanner;

public class DetermineEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[20];
        int[] even = new int[10];

        int total = 0;
        int evenIndex = 0;

        System.out.println("Enter 20 integers(1 - 20): ");
        for(int i=0; i<20; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                even[evenIndex] = num[i];
                evenIndex++;
                total += num[i];
            }
        }

        System.out.print("Even numbers: ");
        for (int e : even) {
            System.out.print(e + " ");
        }

        // Average of even numbers
        double average =(double) total / 10;
        System.out.println("\nThe average of the even numbers is: "+ average);

        int avg = (int) average;
        int factorial = 1;

        // Factorial of integer part of average
        for(int i = 1; i <= avg; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of average = " + factorial);

        // Square root of factorial
        double sqrtFactorial = Math.sqrt(factorial);
        System.out.println("Square root of factorial = " + sqrtFactorial);

        // Standard deviation of factorial and sqrt(factorial)
        double[] values = {factorial, sqrtFactorial};
        double mean = (factorial + sqrtFactorial) / 2;

        double sumSquaredDiffs = 0;
        for(double v : values) {
            sumSquaredDiffs += Math.pow(v - mean, 2);
        }

        double sd = Math.sqrt(sumSquaredDiffs / values.length); // Population SD
        System.out.println("Standard deviation of factorial and its square root = " + sd);
    }
}
