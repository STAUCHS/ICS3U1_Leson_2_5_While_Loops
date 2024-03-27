/**
* A program that asks the user to choose a beverage
* @author: E. Fabroa
*
*/

public class MenuValidation extends ConsoleProgram {

   public void run() {

        System.out.println("Beverage Menu");
        System.out.println("a. Coffee");
        System.out.println("b. Bottled Water");
        System.out.println("c. Chocolate Milk");

        // Declare choice variable
        String strChoice;

        // Get choice from user
        strChoice = readLine("Choose a beverage: ");

        // Checks if user enters a valid option
        while ((strChoice.length() > 1) || !(strChoice.equals("a")) && !(strChoice.equals("b")) && !(strChoice.equals("c"))){
            System.out.println("Invalid input. Please enter a, b, or c.");
            strChoice = readLine("Choose a beverage: ");
        }
        
    }
}