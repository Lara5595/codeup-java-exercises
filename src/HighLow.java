import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

public static int rollDice(int sides){
    Scanner scanner = new Scanner(System.in);
    double rand = Math.random();
    System.out.printf("Enter the number of sides %d");
    int userAnswer = Integer.parseInt(scanner.nextLine());
    if (userAnswer <= sides) {
        System.out.println("Random Number: " + rand);
        return sides;
    } else {
        System.out.println("Try again");
        return rollDice(sides);
    }
}




    public static void main(String[] args) {
        System.out.println(rollDice(6));

    } // end of main
}  // end of HighLow
