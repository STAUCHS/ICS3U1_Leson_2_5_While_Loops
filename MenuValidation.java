/**
*A program that prompts for a valid mark
* @author: E. Fabroa
*
*/

public class MenuValidation extends ConsoleProgram {

   public void run() {

       System.out.println("Beverage Menu");
       System.out.println("a. Coffee");
       System.out.println("b. Bottled Water");
       System.out.println("c. Chocolate Milk");

       // get choice
       String choice = readLine("Choose a beverage: ");

       while ( (choice.length() > 1) || !(choice.equals("a")) && !(choice.equals("b")) && !(choice.equals("c"))){
           System.out.println("Invalid input. Please enter a, b, or c.");
           choice = readLine("Choose a beverage: ");
       }
   }
}