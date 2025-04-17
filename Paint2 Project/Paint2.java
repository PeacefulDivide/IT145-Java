import java.util.InputMismatchException;
import java.util.Scanner;


public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;
        int exactCansNeeded;

        final double squareFeetPerGallons = 350.0;
        //final double gallonsPerCan = 1.0;
        
        // Input validation and try catch
        boolean validHeight = false;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    System.out.println("Wall height must be greater than 0. Try again.");
            } else {
                validHeight = true;
            }
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid height, enter a valid number.");
            scnr.next();
        } 
    } 
        while (!validHeight);

        //Input validation and try catch
        boolean validWidth = false;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            try{
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                    System.out.println("Wall width must be greater than 0. Try again.");
            } else {
                validWidth = true;
            }
        }
         catch (InputMismatchException e) {
            System.out.println("Invalid width, enter a valid number.");
            scnr.next();
         }
    }
         while (!validWidth);


        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        
        // Rounds up value
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        
        // Removes decimal and converts to integer
        exactCansNeeded = Math.toIntExact((long) cansNeeded);
        System.out.print("Cans needed: " + exactCansNeeded);
        
        // Appends "can" or "cans" depending on amount of cans needed
        if (exactCansNeeded <= 1) {
        	System.out.println(" can");
        } else {
        	System.out.println(" cans");
        }
        // Closing input scanner to prevent leaks
        scnr.close();
    }
}
