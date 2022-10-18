// we are importing Scanner form the java library

import java.util.Scanner;


public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;

        // Printf does not make new line you would have to add a !%n
        System.out.printf("Good, %s %s !%n", timeOfDay, cohort);
        // if you have a number you would use %d
        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        System.out.println("Will this be on a seperate line?");
        System.out.println("How about this?");
        // Using float in printf
        // if with do 08 it will have 8 characters and .2 means 2 decimals
        System.out.printf("The number is %08.2f%n", someNumber);
        // if you do a negative it justifies the spaces to the other side
        System.out.printf("The number is %-11.2f test%n", someNumber);


        // Using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        // Scanner just gets one word
        // String userInput = scanner.next();
        // Scanner has a lot of inputs in order to get the whole sentence you can also do next line
        String userInput = scanner.nextLine();
        System.out.printf("Your word was %s.%n", userInput);

        // using scanner.nextInt()
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d", userNumber);

//        System.out.println("Enter a sentence");
//        scanner.nextLine();

        // This solutions makes it so your lines dont combine

        // 1st solution
        // captures the ghost input makes it so you can enter another line
        //  String ghost = scanner.nextLine();

        //  2nd solution
        //  int userNumber = Integer.parseInt(scanner.nextLine()); also makes it work

        // 3rd solution
        // String userInput = scanner.next() + scanner.nextLine()






    }

    public static class AnimalTest {
        public static void main(String[] args) {
            Animal dog = new Animal();
            dog.name = "Hunter";
            dog.sound = "Woof woof";
            dog.makeNoise();
            dog.randomNoise();


            Animal cat = new Animal();
            cat.name = "Simba";
            cat.sound = "Meow";
            cat.makeNoise();
        }
    }

    public static class Animal {
        public String name;

        public String sound;

        public void makeNoise(){
            System.out.printf("%s goes %s%n",name,sound);
        }

        public void randomNoise(){
            System.out.printf("%s goes %s%n", name, Quote.RandomQuote());
        }
    }
}
