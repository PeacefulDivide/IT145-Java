import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      // Add more variables as needed
   
      userText = scnr.nextLine();  // Gets entire line, including spaces. 

      int count = 0;
      
      for(int i = 0; i < userText.length(); ++i) {
         char currChar = userText.charAt(i);
         
         if (currChar != ' ' && currChar != '.' && currChar != '!' && currChar != ',') {
            count++;
         }
      
      }
   System.out.println(count);
   }
   
}
