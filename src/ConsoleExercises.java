// we are importing Scanner form the java library
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %1.2f%n", pi );


        Scanner scanner = new Scanner(System.in);
       //1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
       // What happens if you input something that is not an integer?

        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.format("Your number is %d%n", userNumber);

        // 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.println("Enter a word:");
        String userInput = scanner.next();

        System.out.println("Enter your second word:");
        String userInput2 = scanner.next();

        System.out.println("Enter your third word:");
        String userInput3 = scanner.next();


        System.out.printf("Your Three words are %n%s %s %s%n", userInput, userInput2, userInput3);

        // 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        // do you capture all the words?

        System.out.println("Enter a sentence");
        String userSentence = scanner.next() + scanner.nextLine();
        System.out.printf("My sentence is: %s.%n", userSentence);

        // 4. Rewrite the above example using the nextLine method.
        //^^^

        // Calculate the perimeter and area of Codeup's classrooms.
        // Prompt the user to enter values of length and width of a classroom at Codeup
        System.out.println("Enter the length");
        int lenght = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the width");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length is %dft and the width is %dft%n", lenght, width);

        int areaOfClassroomm = lenght * width;
        System.out.printf("The area is %d", areaOfClassroomm);


    }
}
