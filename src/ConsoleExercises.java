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
         System.out.println("Enter 3 words");
         String word1 = scanner.next();
         String word2 = scanner.next();
         String word3 = scanner.next();
         System.out.printf("This are the 3 words %s %s %s%n", word1, word2, word3);

            // This prompts you to enter 3 separate words 3 times
//        System.out.println("Enter a word:");
//        String userInput = scanner.next();
//
//        System.out.println("Enter your second word:");
//        String userInput2 = scanner.next();
//
//        System.out.println("Enter your third word:");
//        String userInput3 = scanner.next();


//        System.out.printf("Your Three words are %n%s %s %s%n", userInput, userInput2, userInput3);

        // 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        // do you capture all the words?

        System.out.println("Enter a sentence");
        String userSentence = scanner.next() + scanner.nextLine();
        System.out.printf("My sentence is: %s.%n", userSentence);

        // 4. Rewrite the above example using the nextLine method.
        //^^^

        // Calculate the perimeter and area of Codeup's classrooms.
        // Prompt the user to enter values of length and width of a classroom at Codeup
        System.out.println("Enter the length of classroom");
        int lenght = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the width of classroom");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length is %dft and the width is %dft%n", lenght, width);

        int areaAndPerimeterOfClassroom = lenght * 2 + width * 2;
        System.out.printf("The area and perimeter is %dft", areaAndPerimeterOfClassroom);

        // Bonus
        // In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
        // The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
        // scanner.useDelimiter("\n");

//        System.out.println("Enter the length of classroom");
//        double lenght = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Enter the width of classroom");
//        double width = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Enter the height of classroom");
//        double height = Double.parseDouble(scanner.nextLine());
//
//
//        System.out.printf("The length is %dft and the width is %dft%n", lenght, width);
//
//        double areaAndPerimeterOfClassroom = lenght * 2 + width * 2;
//        System.out.printf("The area and perimeter is %dft", areaAndPerimeterOfClassroom);
//
//        double volume = width * height * lenght;
//        System.out.printf("The volume of your classroom is %.2f cubic feet %n", volume);


    }
}
