import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Loop Basics
        // While
        // Create an integer variable i with a value of 5.
        // Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:
        //5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        // 2. Do While
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int j = 0;
//        do {
//            System.out.println("I am incrementing by two " + j);
//            j+=2;
//
//        } while (j < 100);

        // Alter your loop to count backwards by 5's from 100 to -10.

//        int a = 100;
//        do {
//            System.out.println("I am decrementing by five " + a);
//            a-=5;
//        } while (a >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        long b = 2;
        do {
            System.out.println("I am squaring each number " + b);
            b = b * b;
        } while (b < 1000000);


        //For loops
        //Refactor the previous two exercises to use a for loop instead.

        // loop that counts by 2s all the way to 100
//        for(int c = 0; c <= 100; c+=2) {
//            System.out.println(c);
//            if (c == 100) {
//                break;
//            }
//        }

       // loop that decrement by 5 from 100
//       for (int d = 100; d >= -10; d-=5) {
//           System.out.println(d);
//           if (d == -10) {
//               break;
//           }
//       }

        // this squares the numbers
//        for (long e = 2; e <= 1000000; e = e * e){
//            System.out.println(e);
//            if (e == 1000000){
//                break;
//            }
//        }







    }
}
