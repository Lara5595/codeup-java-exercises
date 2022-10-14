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


        String goAgain = "y";  // Created this so when the user answer yes it continues
        while (goAgain.equalsIgnoreCase("y")) {  // while the user enter yes go again
            System.out.println("Hello I am B0B the Human");       // Bob introduction
            String userAnswer = scanner.nextLine();
            if (userAnswer.endsWith("?")) {
                System.out.println("Sure");
            } else if (userAnswer.endsWith("!")) {
                System.out.println("Whoa chill out");
            } else if (userAnswer.equals("")) {
                System.out.println("Fine. Be That Way!");
            } else if (userAnswer.equalsIgnoreCase("are robots taking over")) {
                System.out.println("Of course");
            } else if (userAnswer.equalsIgnoreCase("tell a joke")) {
                System.out.printf("Why did the chicken cross the road%n.... idk %n");
            } else {
                System.out.println("WhatEver");
            }

            System.out.println("Do you want to continue?");
            goAgain = scanner.next();
            scanner.nextLine();
        } // end of while loop


// Mason method
//        String userInput, conversation = "";
//        userInput = scanner.nextLine();
//
//        System.out.println();



    }
}
