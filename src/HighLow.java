import java.util.Random;
import java.util.Scanner;

public class HighLow {

//    public static int gameDev(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Guess the number from %d to %d", min,max);
//        int userAnswer = Integer.parseInt(scanner.nextLine());
//        Random rand = new Random(); // instance of random class
//
//
//    }
//    public static int getNumber(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userAnswer = Integer.parseInt(scanner.nextLine());
//
//        if (userAnswer <= max && userAnswer >= min) {
//            System.out.println("You got it");
//            return userAnswer;
//        } else {
//            System.out.println("Try again");
//            return getNumber(min, max);
//        }
//    }

public static int getNumber(int min, int max) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter a number between %d and %d:", min, max);
    int userAnswer = Integer.parseInt(scanner.nextLine());

    if (userAnswer <= max && userAnswer >= userAnswer) {
        System.out.println("You got it");
        return userAnswer;
    } else {
        System.out.println("Try again");
        return getNumber(min,max);
    }
}


    public static void main(String[] args) {
//        System.out.println(gameDev(1,100));
        System.out.println(getNumber(1,10));



    } // end of main
}  // end of HighLow
