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


   // Methods\

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
   public boolean yesNo() {
      System.out.println("Enter yes/no : ");
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
   public int getInt() {
      System.out.println("Enter your Number: ");
      return scanner.nextInt();
   }


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

      public double getDouble() {
      System.out.println("Enter your Decimal number: ");
      return scanner.nextDouble();
   }







   // Constructor
   public Input(){
      scanner = new Scanner(System.in);
   }


} // End of input



// 1. Create an input validation class
//Create a package inside of src named util. Inside util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()
