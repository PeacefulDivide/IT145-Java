import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String userInput;
      String word1;
      String word2;
      
      do{
         System.out.println("Enter input string: ");
         userInput = scnr.nextLine();
         
         if (userInput.contains(",")){
            userInput = userInput.replace(",", " ");
            inSS = new Scanner(userInput);
            word1 = inSS.next();
            word2 = inSS.nextLine();
            word2 = word2.stripLeading();
            System.out.printf("First word: %s\nSecond word: %s\n\n\n", word1, word2);
         }
         else if(userInput.equalsIgnoreCase("q")){
            continue;
         }
         else{
            System.out.println("Error: No comma in string");
         }
      }
      while (!(userInput.equalsIgnoreCase("q")));
      scnr.close();
   }
}
      
      
      
      
      //return;
   //}
//}