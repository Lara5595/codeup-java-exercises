import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Create a class named Bob with a main method for the following exercise.
        // Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.


        String goAgain = "y";
        while (goAgain.equalsIgnoreCase("y")) {
            System.out.println("Bob, are you okay?");
            String userAnswer = scanner.next();
            if (userAnswer.endsWith("?")) {
                System.out.println("Who, chill out!");
            }
            System.out.println("Do you want to continue?");
            goAgain = scanner.next();
            scanner.nextLine();
        }



    }
}
