package Guessing_Game;

public class guess_methods {

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <= 0 || userAnswer > 100){
            return "Your guess is invalid";
        } else if (userAnswer == computerNumber) {
            return "Correct!\n Total Guesses: " + count;
        } else if (userAnswer > computerNumber) {
            return "Your guess is to high, try gain.\nTry Number: " + count;
        } else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\n Try Number: " + count;
        } else {
            return "Your guess is incorrect \n Try Number: " + count;
        }
    }
}
