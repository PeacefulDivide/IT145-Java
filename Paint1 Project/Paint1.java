import java.util.Scanner;
import java.util.InputMismatchException;
//Import exception handling

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
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
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        scnr.close();
    }
}
