import java.util.Scanner;

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

    public static int divideFunction(int e, int f) {
        return e / f;
    }

    public static int remainderFunction(int g, int h) {
        return g % h;
    }


    // Bonus
    // Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static int multiplicationWithoutOperator(int j, int k){
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
            return (l + multiplyingWithRecursion(l,m - 1));
    }

    // 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    // MASON ANSWER
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userAnswer = Integer.parseInt(scanner.nextLine());
////        int userInput = getInteger(1, 10);
//        if (userAnswer <= max && userAnswer >= min) { // userAnswer must be within range
//            System.out.println("Great job Mr. Timothy! You're a big boi now :)");
//            return userAnswer;
//        } else {
//            System.out.println("You're a bad boi timmmy");
//            return getInteger(min, max);
//        }
//    }

    public static int getNumber(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userAnswer = Integer.parseInt(scanner.nextLine());

        if (userAnswer <= max && userAnswer >= min) {
            System.out.println("You got it");
            return userAnswer;
        } else {
            System.out.println("Try again");
            return getNumber(min, max);
        }
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("I am adding " + addFunction(3,4));
//        System.out.println(" I am subtracting " + subtractFunction(6,5));
//        System.out.println(" I am multiplying " + multiplyFunction(5,5));
//        System.out.println(" I am dividing " + divideFunction(20,5));
//        System.out.println(" I am the remainder " + remainderFunction(10,3));
//        System.out.println(" I am multiplying with a for loop " + multiplicationWithoutOperator(5,6));
//        System.out.println(" I am doing recursion loop " + multiplyingWithRecursion(8,5));
        System.out.println(getNumber(1,10));



    }
}
