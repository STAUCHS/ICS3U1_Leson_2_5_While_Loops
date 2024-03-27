/**
* Enter a mark from 0 to 100
* @author: E. Fabroa
*/

public class DataValidation1 extends ConsoleProgram {

  public void run() {

      // Declare mark variable
      double dblMark;

      // Get mark from user
      dblMark = readDouble("Enter a mark (0-100): ");

      // Prompts user to enter a mark again if they enter a mark outside the required range
      while (dblMark < 0 || dblMark > 100) {
          System.out.println("Invalid input.");
          dblMark = readDouble("Enter a mark (0-100): ");
      }

      System.out.println("Thank-you!!");

  }
}