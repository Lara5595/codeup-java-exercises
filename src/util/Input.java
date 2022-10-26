package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

   private Scanner scanner;
   // Its best practice if setter and getters are on top and constructors are on the bottom

   // getter
   public Scanner getScanner() {
      return scanner;
   }

   // setter
   public void setScanner(Scanner scanner) {
      this.scanner = scanner;
   }


   /////////////////////////////////////////////////////////////// Methods\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

   // Returns your string
   public String getString() {
      System.out.println("Enter your input: ");
      return scanner.nextLine();
   }

   public String getString(String prompt){
      System.out.println(prompt);
      return scanner.nextLine();
   }



   // Returns True or false
//   public boolean yesNo() {
//      System.out.println("Enter yes/no : ");
//      String userInput = scanner.nextLine().toLowerCase();
//
//      if (userInput.equals("y") || userInput.equals("yes")) {
//         return true;
//      } else {
//         return false;
//      }
//   }

   // We changed the YesNo to prompt
   public boolean yesNo(String prompt) {
      System.out.println(prompt);
      String userInput = scanner.nextLine().toLowerCase();

      if (userInput.equals("y") || userInput.equals("yes")) {
         return true;
      } else {
         return false;
      }
   }


   // Prompts user till they get a number in between min and max
   public int getInt(int min, int max){
      System.out.printf("Enter a number between %d and %d ", min, max);
      int userInput2 = Integer.parseInt(scanner.nextLine());

      if (userInput2 <= max && userInput2 >= min) {
         System.out.println("You got it");
         return userInput2;
      } else {
         System.out.println("Try again");
         return getInt(min,max);
      }
   }

   // Returns a integer
    /*
        TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
     */


//   public int getInt(){
//      try {
//         Integer.valueOf(getString());
//      } catch (NumberFormatException e){
//         e.printStackTrace();
//         System.out.println("Please enter a Int");
//         getInt();
//      }
//      return 0;
//
//   }

   // This is without e.printStackTrace()
   public int getInt(){
      // get user input as a string
      // parse the string into a number
      // if the parse throws an exception, recurse
      // if no exception return the parsed number
      String userInput = getString();
      try {
        return Integer.valueOf(userInput);
      } catch (NumberFormatException e) {
         System.out.println("Invalid input type. Enter a number!");
         return getInt();
      }
   }

//   public int getInt() {
//      System.out.println("Enter your Number: ");
//      return scanner.nextInt();
//   }


   public double getDouble(double min, double max) {
      System.out.printf("Enter a decimal number between %f and %s " , min, max); // I used f and s to compare it
      double userInput3 = scanner.nextDouble();

      if (userInput3 >= min && userInput3 <= max) {
         System.out.println("You got the Double, meaning you got it");
         return userInput3;
      } else {
         System.out.println("Please Try again");
         return getDouble(min,max);
      }
   }

   public double getDouble(String prompt){
      System.out.println(prompt);
      return scanner.nextDouble();
   }


     /*
        TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
     */

   public double getDouble(){
      String userInput = getString();
      try {
        return Double.valueOf(userInput);
      } catch (NumberFormatException e){
         System.out.println("Please enter a double");
        return  getDouble();
      }
   }


//      public double getDouble() {
//      System.out.println("Enter your Decimal number: ");
//      return scanner.nextDouble();
//   }

   /////////////////////////////////////////////////////////////// End of Methods\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\






   /////////////////////////////////////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

   public Input(){
      scanner = new Scanner(System.in);
   }


   /////////////////////////////////////////////////////////////// End of Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


} // End of input




