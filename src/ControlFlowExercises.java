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
//        } while (j <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.

//        int a = 100;
//        do {
//            System.out.println("I am decrementing by five " + a);
//            a-=5;
//        } while (a >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long b = 2;
//        do {
//            System.out.println("I am squaring each number " + b);
//            b = b * b;
//        } while (b < 1000000);


        //For loops
        //Refactor the previous two exercises to use a for loop instead.
        // loop that counts to 15 and starts at 5
//        for (int l = 5; l <= 15; l++) {
//            System.out.println(l);
//            if (l == 15) {
//                break;
//            }
//        }


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
//        for (long e = 2; e <= 1000000; e*=e){
//            System.out.println(e);
//            if (e == 1000000){
//                break;
//            }
//        }






        // FIZZBUZZ
//     2.    One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        int y = 1;
//        while (y<=100){
//            System.out.println("I am counting to hundredth " + y);
//            y++;
//        }


//        For multiples of three: print ???Fizz??? instead of the number.
//        for (int r = 1; r <= 100; r++){
//            if (r % 3 == 0){
//                System.out.println("FIZZ");
//            } else {
//                System.out.println(r);
//            }
//        }

//        For the multiples of five: print ???Buzz???.
//        for (int g = 1; g <= 100; g++){
//            if (g % 5 == 0){
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(g);
//            }
//        }


//        For numbers which are multiples of both three and five: print ???FizzBuzz???.
//        for (int h = 1; h <= 100; h++){
//            if ( h % 3 == 0 && h % 5 == 0) {
//                System.out.println("FIZZBUZZ");
//            } else if (h % 3 == 0){
//                System.out.println("FIZZ");
//            } else if ( h % 5 == 0){
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(h);
//            }
//        }


        // 3. Display a table of powers.
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        System.out.println("What number would you like to go up to ");
//        int userNumber = scanner.nextInt();
//        scanner.nextLine();
//        String userResponse = "Y".toLowerCase();
//        System.out.println("Here is your Table!");
//        System.out.printf("Number | Squared | Cubed%n ----- | ------  | -----%n");
//
//        while (userResponse.equals("y".toLowerCase())) {
//            // number
//            for (int b = 1; b <= userNumber; b++) {
//                int squared = b * b;
//                int cubic = b * b * b;
//                System.out.println(b + "      |" + squared + "        |" + cubic);
//            }
//            System.out.println("Do you want to continue? Y/N");
//            userResponse = scanner.nextLine().toLowerCase();
//
//            System.out.println("What number now");
//            userNumber = scanner.nextInt();
//            scanner.nextLine();
//
//        }

        // walkthrough answer
        // Do whiles need a global variable if you want to use it like userChoice
//        String userChoice;
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println(""); // to create a blank line
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("-------| --------| ------");
//
//            for (int i =1; i <= userInput; i++){
//                System.out.printf("%-7d| %-8d| %d%n", i, i*i, i*i*i);
//            }
//            System.out.println("Do you want to continue? Y/N ");
//            userChoice = scanner.next();
//        } while (userChoice.equals("y".toLowerCase()));


     // 4. Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        System.out.println("Enter a numerical grade form 0 to 100: ");
//        byte grade = scanner.nextByte();
//        char letterGrade;
//        if (grade >=0 && grade <= 59){
//            letterGrade = 'F';
//        } else if (grade > 59 && grade <= 66) {
//            letterGrade = 'D';
//        } else if (grade > 66 && grade <= 79) {
//            letterGrade = 'C';
//        } else if (grade > 79 && grade <= 87) {
//            letterGrade = 'B';
//        } else {
//            letterGrade = 'A';
//        }
//        System.out.println("The letter grade is " + letterGrade );

        // Refactor to a while loop

        String userChoice = "y";
        while (userChoice.equals("y")){
            System.out.println("Enter a numerical grade from 0 to 100:");
            byte grade = scanner.nextByte();
            char letterGrade;
            if (grade <= 59){
                letterGrade = 'F';
            } else if (grade <= 66){
                letterGrade = 'D';
            } else if (grade <= 79) {
                letterGrade = 'C';
            } else if (grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is " + letterGrade);
            System.out.println("Would you like to enter another grade? y/n");
            userChoice = scanner.next();
        }




        // Bonus
        // Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).


    } // end main

    public static class Club {
        public static  int maxDamage = 4;

    }
}  // end class