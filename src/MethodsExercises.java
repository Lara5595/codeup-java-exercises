import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    // Create four separate methods. Each will perform an arithmetic operation:
    // Addition
    //Subtraction
    //Multiplication
    //Division
    // Add a modulus method that finds the modulus of two numbers.

    public static int addFunction(int x, int y) {
        return x + y;
    }

    public static int subtractFunction(int a, int b) {
        return a - b;
    }

    public static int multiplyFunction(int c, int d) {
        return c * d;
    }

    public static double divideFunction(double e, double f) {   // we made it double instead of int because it will give you inaccurate answers
        return e / f;
    }

    public static int remainderFunction(int g, int h) {
        return g % h;
    }


    // Bonus
    // Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static int multiplicationWithoutTimesOperator(int j, int k) {
        int total = 0;
        for (int i = 0; i < j; i++) {
            total += k;
        }
        return total;
    }

    // Recursion
    // Do the above with recursion.
    public static int multiplyingWithRecursion(int l, int m) {
        if ((l == 0) || (m == 0))
            return 0;
        else
            return (l + multiplyingWithRecursion(l, m - 1));
    }

    // 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userAnswer = Integer.parseInt(scanner.nextLine());

        if (userAnswer <= max && userAnswer >= min) {
            System.out.println("You got it");
            return userAnswer;
        } else {
            System.out.println("Try again");
            return getInteger(min, max);
        }
    }

    // 3. Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex

//    public static int factorial(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter a integer from  %d to %d: ", min, max);
//        int userAnswer2 = Integer.parseInt(scanner.nextLine());
//
//        if (userAnswer2 < min || userAnswer2 > max) {
//            System.out.println("Do you want to continue");
//            return factorial(min,max);
//        }
//
//        int acc = 1;
//        for (int i = 1; i < userAnswer2 + 1; i++) {
//            acc *= i;
//        }
//        return acc;
//
//    }





// 4.   Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers

//    public static int diceRolling(int sides) {       // our parameter is sides
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many sides does the die have?"); // first step is ask the user how many sides it has
//        sides = scanner.nextInt();     // This makes it so it appears on the console
//
//        System.out.println("Do you want to roll the die");  // Second step is ask the user to roll the dice
//        String userResponse = scanner.next();     // call it to appear on console.
//
//        double roll = 0;
//
//        if (userResponse.contains("y")) {
//            roll = Math.random() * sides + 1;
//            return (int) roll;
//        }   else if (userResponse.contains("Yes")) {
//            System.out.println("Do you want to continue");
//            return diceRolling(sides);
//        }
//        return (int) roll;
//
//
//    }


    // walk through answer

    public static long generateRandomNumber(int max) {
        return Math.round(Math.random() * max);
    }
    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides do the dice have? ");
        byte numberOfSides = scanner.nextByte();
        System.out.printf("Your dice have %d sides.%n ", numberOfSides);
        System.out.println("Do you want to roll the dice? y/n");
        String userChoice = scanner.next();
        if (userChoice.equals("y")){
            System.out.println("You rolled the dice!");
            System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides), generateRandomNumber(numberOfSides));
        }
        System.out.println("Do you want to roll the dice again? ");
        if (scanner.nextLine().equals("y")){
            rollDice();
        }
    }





    // we are calling our functions on main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("I am adding " + addFunction(3,4));
//        System.out.println(" I am subtracting " + subtractFunction(6,5));
//        System.out.println(" I am multiplying " + multiplyFunction(5,5));
//        System.out.println(" I am dividing " + divideFunction(20,5));
//        System.out.println(" I am the remainder " + remainderFunction(10,3));
//        System.out.println(" I am multiplying with a for loop " + multiplicationWithoutTimesOperator(5,6));
//        System.out.println(" I am doing recursion loop " + multiplyingWithRecursion(8,5));
//        System.out.println(getInteger(1,10));
//          System.out.println(factorial(1,10));
//        System.out.println(diceRolling(6));


            rollDice();
    }
}




