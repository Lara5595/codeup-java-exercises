import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HighLow {







    public static void main(String[] args) {


    } // end of main
}  // end of HighLow



// Walkthrough answers
//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static int addition(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2){
//        return num1 - num2;
//    }
//
//    public static int multiplication(int num1, int num2){
//        return num1 * num2;
//    }
//
//    public static double division(double num1, double num2){
//        return num1 / num2;
//    }
//
//    public static int remainder(int num1, int num2){
//        return num1 % num2;
//    }
//
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter an integer between %d and %d:%n", min, max);
//        int userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            System.out.printf("You entered %d%n", userInput);
//            return userInput;
//        } else {
//            System.out.printf("You entered %d, which is out of the range%n", userInput);
//        }
//        return getInteger(min, max);
//    }
//
//
//    public static long calculateFactorial(int num){
//        long factorial = 1;
//        for (int i = 1; i <= num; i++){
//            factorial = factorial * i;
//        }
//        return factorial;
//    }
//
//    public static void factorial(){
//        int userInput = getInteger(1, 20);
//        long factorial = calculateFactorial(userInput);
//        System.out.printf("The factorial of %d is %d%n", userInput, factorial);
//        System.out.printf("Would you like to calculate another factorial? y/n%n");
//        String userChoice = new Scanner(System.in).next();
//        if (userChoice.equals("y")) factorial();
//    }
//
//    public static int generateRandomNumber(int max){
//        return (int) Math.ceil(Math.random() * max);
//    }
//
//    public static void rollDice(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many sides do the dice have?");
//        byte numberOfSides = scanner.nextByte();
//        System.out.printf("Your dice have %d sides.%n", numberOfSides);
//        System.out.println("Do you want to roll the dice? y/n");
//        String userChoice = scanner.next();
//        while (userChoice.equals("y")){
//            System.out.println("You rolled the dice!");
//            System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides), generateRandomNumber(numberOfSides));
//            System.out.println("Do you want to roll the dice again?");
//            userChoice = scanner.next();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
////        System.out.println(addition(6, 8));
////        System.out.println(subtraction(17, 8));
////        System.out.println(multiplication(12, 12));
////        System.out.println(division(20, 3));
////        System.out.println(remainder(20, 3));
////        getInteger(1, 10);
////        factorial();
//        rollDice();
//
////        System.out.println(factorialMethod(6));
//    }
//
//}