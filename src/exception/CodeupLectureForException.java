package exception;

import util.Input;

import java.util.Scanner;

public class CodeupLectureForException {

    // Methods
    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }



    // end of method


    public static void main(String[] args) throws Exception {

        // Example
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);
//         Exception output Index 999 out of bounds for length 3

//        throw new Exception("Something bad happened!");
//        System.out.println("after the throw statement");

        // Example 2
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }


        // Example 3
//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }


        // Working with Checked Exceptions
        // Example 4
//        String indentationPreference;
//
//        try {
//            indentationPreference = getIndentationPreference();
//            System.out.println("Okay, " + indentationPreference + " is a great choice.");
//        } catch (Exception e) {
//            System.out.println("Uh oh, something went wrong: " + e.getMessage());
//            System.out.println("Here is some more detail:");
//            e.printStackTrace();
//        }

        // This is another way you can write it if you put the throws exception on main
//        String indentationPreference = getIndentationPreference();
//        System.out.println("Okay, " + indentationPreference + " is a great choice.");


        // Working with Custom Exceptions
        // Example 5
//        class WrongIndentationTypeException extends Exception {}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("What type of indentation do you prefer?");
//        String indentationPreference = sc.nextLine();
//
//        if (indentationPreference.equals("tabs")) {
//            WrongIndentationTypeException e;
//            e = new WrongIndentationTypeException("Spaces are superior!");
//            throw e;
//        }




    } // end of main
} // end of codeupLecture







