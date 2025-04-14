import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      //System.out.println(arrowBaseHeight);
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      //System.out.println(arrowBaseWidth);
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      //System.out.println();
      
      
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
         
      }
      System.out.println();
      for (int i = 0; i < arrowBaseHeight; ++i) {
         for (int j = 0; j < arrowBaseWidth; ++j) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      while (arrowHeadWidth > 0) {
         for (int j = 0; j < arrowHeadWidth; ++j) {
            System.out.print("*");
         }
        System.out.println();
        arrowHeadWidth--;
      }
     
   }
}