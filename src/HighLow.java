import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int gameDev(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Guess the number from %d to %d", min,max);
        int userAnswer = Integer.parseInt(scanner.nextLine());
        Random rand = new Random(); // instance of random class


    }
    // 5.   public static int factorial(int min, int max) {
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

    public static void main(String[] args) {
        System.out.println(gameDev(1,100));



    } // end of main
}  // end of HighLow
