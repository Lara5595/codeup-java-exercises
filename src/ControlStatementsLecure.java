import java.util.Scanner;

public class ControlStatementsLecure {
    public static void main(String[] args) {

        // Statements
        int myInteger = 20;

        int x = 3;
        // Java does not have ===

        // if else statement
        if (x == 5) {
            System.out.println("x is 5");
        } else if (x > 5 && x < 15){
            System.out.println("x is betweeen 5 and 15");
        } else {
            System.out.println(" x is less than 5");
        }


        //  Traditional switch statements
        String customerChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want?");
        customerChoice = scanner.next().toLowerCase();

        //        switch (customerChoice) {
        //            case "vanilla":
        //                System.out.println("One vanilla coming right up");
        //                break;
        //            case "chocolate":
        //                System.out.println("chocolate coming right up");
        //                break;
        //            case "strawberry":
        //                System.out.println("strawberry coming right up");
        //                break;
        //            default:
        //                System.out.println("We don't have that");
        //                break;
        //        }


        // Enhanced switch statement

        switch (customerChoice) {
            case "vanilla" -> System.out.println("One vanilla coming right up");
            case "chocolate" -> System.out.println("chocolate coming right up");
            case "strawberry" -> System.out.println("strawberry coming right up");
            default -> System.out.println("We don't have that");
        }

        // Using boolean

        boolean existence = true;
        if (existence) System.out.println("Yes");



        // Evaluation short circuits
        int c = 0, d = 100, e = 50;
        if (c == 0 && e++ < 100) {

        }
        System.out.println("e = " + e);


        // the answer will not be incremented because  it only checks for the first one
        // int theAnswer = 42;
        // if (existence || theAnswer++ == 42){}
        // System.out.println(theAnswer);

        // The answer will be incremented
        int theAnswer = 42;
        if (existence | theAnswer++ == 42){}
        System.out.println(theAnswer);

       // The || only checks for one of them to be true so if the first is true then it short circuits
       // The | checks for both



        // Loop in Java
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10) {
//            System.out.println("Now I'm in the loop. I has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. I has incremented and its value is " + i);
//        }
//        System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);

        // Do while loop
        do {
            System.out.println("You will see this despite the condition!");
        } while (false);


        // for loop in Java
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }



    }
}
