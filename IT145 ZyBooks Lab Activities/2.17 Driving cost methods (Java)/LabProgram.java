import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
      return (milesDriven * (1.0 / milesPerGallon) * dollarsPerGallon);
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      double milesPerGallon;
      double dollarsPerGallon;
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10));
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50));
      System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400));
      
      
   }
}
