import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      /* Type your code here. */
      //for user input
      Scanner scnr = new Scanner(System.in);
      
      // create array of five peoples weights
      double [] weights = new double[5];
      
      //prompt user to enter weights
      //System.out.println("Enter five numbers, being five peoples weights.");
      
      //output array
      for (int i = 0; i < weights.length; ++i) {
         weights[i] = scnr.nextDouble();
         System.out.println("Enter weight " + (i + 1) + ": ");
      }
      
      System.out.println();
      System.out.println("You entered: " + weights[0] + " " + weights[1] + " " + weights[2] + " " + weights [3] + " " + weights[4] + " ");
      
      double sumVal = 0;
      for (int i = 0; i < weights.length; ++i) {
         sumVal = sumVal + weights[i];
      }
      System.out.println("Total weight: " + sumVal);
      System.out.println("Average weight: " + sumVal / 5);
      
      double maxVal = weights[0];
      for (int i = 0; i < weights.length; ++i) {
         if (weights[i] > maxVal) {
            maxVal = weights[i];
         }
      }
      System.out.println("Max weight: " + maxVal);
         
      return;
   }
}